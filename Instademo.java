package instagram;

class instagram
{
	int count;
	String text;
	int call;
	int video;
	String posts;
	String stories;
	String reels;
	String shop;
	int notes;
	int music;
	int ai;
public instagram(int count,String text)
{
	this.count=count;
	this.text=text;
}
public void instagram(int count,String text,int call)
{
	this.count=count;
	this.text=text;
	this.call=call;
}
public void instagram(int count,String text,int call,int video)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
}
public void instagram(int count,String text,int call,int video,String posts)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
}
public void instagram(int count,String text,int call,int video,String posts,String stories)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
}
public void instagram(int count,String text,int call,int video,String posts,String stories,String reels)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
	this.reels=reels;
}
public void instagram(int count,String text,int call,int video,String posts,String stories,String reels,String shop)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
	this.reels=reels;
	this.shop=shop;
}
public void instagram(int count,String text,int call,int video,String posts,String stories,String reels,String shop,int notes)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
	this.reels=reels;
	this.shop=shop;
	this.notes=notes;
}
public void instagram(int count,String text,int call,int video,String posts,String stories,String reels,String shop,int notes,int music)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
	this.reels=reels;
	this.shop=shop;
	this.notes=notes;
	this.music=music;
}
public void instagram(int count,String text,int call,int video,String posts,String stories,String reels,String shop,int notes,int music,int ai)
{
	this.count=count;
	this.text=text;
	this.call=call;
	this.video=video;
	this.posts=posts;
	this.stories=stories;
	this.reels=reels;
	this.shop=shop;
	this.notes=notes;
	this.music=music;
	this.ai=ai;
}
void output()
{
	System.out.println("count: "+count);
	System.out.println("Text: "+text);
	System.out.println("call: "+call);
	System.out.println("video: "+video);
	System.out.println("posts: "+posts);
	System.out.println("stories: "+stories);
	System.out.println("reels: "+reels);
	System.out.println("shop: "+shop);
	System.out.println("notes: "+notes);
	System.out.println("music: "+music);
}
public static void main(String[] args) {
	instagram i=new instagram(10,"raju");
	//i.output();
	i.instagram(12, "bgjhgvb", 10);
	i.instagram(5, "pavan", 12, 15);
	i.instagram(10,"prasanth", 8, 7, "pro");
	i.instagram(44, "pavan kumar", 1, 2, "gym", "son");
	i.instagram(2, "jyonath", 2, 2, "N", "G","ok");
	i.instagram(22, "bhanu", 1, 2, "bot", "ff", "tpr", "pro");
	i.instagram(6, "i", 5, 7, "a", "m", "o", "k", 7);
	i.instagram(66, "u", 8, 9, "yes", "no", "true", "false", 2, 1);
	i.instagram(1, "jyonath", 123456789, 3, "Gaming", "Upload stories", "Swipe up for new reel", "Nonstop", 2, 3, 4);
	i.output();
}
}


