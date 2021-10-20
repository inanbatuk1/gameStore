package homeWork2Week;

public class Main {

	public static void main(String[] args) {
		
		Photos  photos1 = new Photos();
		photos1.id=1;
		photos1.photoName = "kedi resmi";
		photos1.photoDesc= "farklý renkte gözleri olan kedi";
		photos1.totalLike=10000;
		
		Photos  photos2 = new Photos();
		photos2.id=2;
		photos2.photoName = "köpek resmi";
		photos2.photoDesc= "Sivas kangal köpek";
		photos2.totalLike=110000;
		
		Photos  photos3 = new Photos();
		photos3.id=3;
		photos3.photoName = "bmw 520 tdi resmi";
		photos3.photoDesc= "super confort bmw";
		photos3.totalLike=1110000;
		
		Videos videos1 =  new Videos();
		videos1.id= 4;
		videos1.videoName= "van kedisi";
		videos1.videoDesc= "duvardan duvara atlayan kedi";
		
		Videos videos2 =  new Videos();
		videos2.id= 5;
		videos2.videoName= "beþiktaþ maçý";
		videos2.videoDesc= "beþiktaþ 5 fenerbahçe 0";
		
		PhotosManager photosManager =  new PhotosManager();
		photosManager.addtoPhotoAndVideo(photos3,videos1);
		photosManager.addtoPhotoAndVideo(photos2,videos2);
		
		System.out.println(photos1.photoName);
		
		
	}

}
