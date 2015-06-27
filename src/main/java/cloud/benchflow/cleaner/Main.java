package cloud.benchflow.cleaner;

import java.util.List;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.jooq.Result;

import cleandb.cleanrawdata.tables.Environmentdata;
import cleandb.cleanrawdata.tables.records.EnvironmentdataRecord;

public class Main {
	Cli cli;

//	public static void main(String[] args) {
//		Main main = new Main(args);
//		main.run();
//
//	}
//	
//	public Main(String [] args){
//		cli = new Cli(args);
//	}
//
//	public void run(){
//		
//	}
	
	private class Cli{
		private String[] args = null;
		private Options options = new Options();
		
		public Cli(String[] args){
			this.args = args;
			String description = "";
			options.addOption("n", "destinationUser", true, description);
			options.addOption("a", "destinationPassword", true, description);
			options.addOption("t", "destinationUrl", true, description);
			options.addOption("s", "sourceUrl", true, description);
			options.addOption("o", "sourceUser", true, description);
			options.addOption("u", "sourcePassword", true, description);
			options.addOption("e", "experimentID", true, description);
			options.addOption("r", "repetitionNum", true, description);
			options.addOption("c", "class", true, "Class to configure to run cleaner; 'e' to clean environment data; for data form engine: 'c' for camunda with mysql db");
			options.addOption("h", "help", false, "Help");
			
			options.addOption("n", "environmentID", true, description);
			
		}
		
		void help(){
			HelpFormatter formater = new HelpFormatter();
			formater.printHelp("Main", options);
			System.exit(0);
		}
		
		public void parse(){
			String destinationUser = null;
			String destinationPassword = null;
			String destinationUrl = null;
			String sourceUrl = null;
			String sourceUser = null;
			String sourcePassword = null;
			String experimentID = null;
			int repetitionNum = 0;
			
			String environmentID = null;
			
			CommandLineParser parser = new BasicParser();

			try {
				CommandLine cmd = parser.parse(options, args);
				
				String opt;
				opt = "h";
				if( cmd.hasOption( opt ) ){
					help();
				}
				
				opt = "n";
				if( cmd.hasOption( opt ) ){
					destinationUser = cmd.getOptionValue( opt );
				}
				
				opt = "a";
				if( cmd.hasOption( opt ) ){
					destinationPassword = cmd.getOptionValue( opt );
				}
				
				opt = "t";
				if( cmd.hasOption( opt ) ){
					destinationUrl = cmd.getOptionValue( opt );
				}
				
				opt = "s";
				if( cmd.hasOption( opt ) ){
					sourceUrl = cmd.getOptionValue( opt );
				}
				
				opt = "o";
				if( cmd.hasOption( opt ) ){
					sourceUser = cmd.getOptionValue( opt );
				}
				
				opt = "u";
				if( cmd.hasOption( opt ) ){
					sourcePassword = cmd.getOptionValue( opt );
				}
				
				opt = "e";
				if( cmd.hasOption( opt ) ){
					experimentID = cmd.getOptionValue( opt );
				}
				
				opt = "r";
				if( cmd.hasOption( opt ) ){
					String tempRepetitionNum = cmd.getOptionValue( opt );
					try{
						repetitionNum = Integer.parseInt( tempRepetitionNum );
					} catch (Exception e) {
						e.printStackTrace();
						System.exit(1);
					}
				}
				
				opt = "c";
				if( cmd.hasOption( opt ) ){
					String classToStart = cmd.getOptionValue( opt );
					if( classToStart.toLowerCase().equals("e") ){
						EnvCleaner env = new EnvCleaner( destinationUser , destinationPassword, destinationUrl, sourceUrl, experimentID, repetitionNum, environmentID);
						
						List<String> sourceData = env.selectData();
						Result<EnvironmentdataRecord> record = env.transformEnvironmentdata(sourceData);
						env.storeCleanData(Environmentdata.ENVIRONMENTDATA, record);
						
					}else if( classToStart.toLowerCase().equals("c") ){
						CamundaCleaner cc = new CamundaCleaner(destinationUser, destinationPassword, destinationUrl, sourceUrl, sourceUser, sourcePassword, experimentID, repetitionNum);
						
						cc.clean();
					}
				}

				
			} catch (ParseException e) {
				System.err.println("Error in command line properties");
				help();
			}

			
			
		}
		
		
	}
	
}


