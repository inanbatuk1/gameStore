package homeWork2Week;

public class PhotosManager {
	
	public void addtoPhotoAndVideo(Photos photo,Videos videos) {
		
		System.out.println("Resim baþarýyla eklendi. " +photo.photoName +"\n"
		+videos.videoName+" "+videos.videoDesc);
		
	}
	
	public void likePhotoAndVideo(Photos photo,Videos videos) {
		
		System.out.println("xxx kiþisi beðendi "+photo.totalLike+"\n"+videos.totalLike);
		
	}
	
}
