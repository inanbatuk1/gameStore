package homeWork2Week;

public class Photos {
	int id;
	String photoName;
	String photoDesc;
	int totalLike;

	public Photos() {

	}

	public Photos(int id, String photoName, String photoDesc, int totalLike) {
		this();
		this.id = id;
		this.photoName = photoName;
		this.photoDesc = photoDesc;
		this.totalLike = totalLike;
	}

}
