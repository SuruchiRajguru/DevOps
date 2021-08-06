package AWS_Docker_Maven.AWS_Docker_Maven;

import java.io.File;
import java.util.List;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class AwsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AWSCredentials credentials = new BasicAWSCredentials(
			            //      "AKIA43ZGFXTVKBUI3RX6", 
			              //    "d9Pl3gOL9Sh7CjttaXwShg+7uz0mXU+byKBqkt0U"
					"AKIA43ZGFXTVFYOSGFVT",
					"Bv9/giFOGu0TqNo4gbuDlQ3Mct45MNIAlOaOPaxi"
			                );
			
		
				AmazonS3 s3client = AmazonS3ClientBuilder
				                  .standard()
				                  .withCredentials(new AWSStaticCredentialsProvider(credentials))
				                  .withRegion(Regions.US_EAST_2)
				                  .build();
				        
				
					//======== Create S3 Bucket =================
					  /*      
					        String bucketName = "suruchi123";
					        if(s3client.doesBucketExist(bucketName)) {
					           
					            return;
					        }else {
					            s3client.createBucket(bucketName);
					            System.out.println("bucket created");
					            
					            
					        }
					        
					        */
					
					      //======== List S3 Bucket =================
						    
					        List<Bucket> buckets = s3client.listBuckets();
					        for(Bucket bucket : buckets) {
					            System.out.println(bucket.getName());
					        }

					      
					        	//======== Put Objects into S3 Bucket =================
					        	        //C:\\Users\\TiaaUser\\OneDrive\\Desktop\\Docker\\Git Commands.txt
					        	        s3client.putObject(
					        	                  "suruchi123", 
					        	                  "myfile", 
					        	                  new File("C:\\Users\\Suruchi\\Desktop\\quantity.txt")
					        	                );
					        	        
					     	        
	}


		}
