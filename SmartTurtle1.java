import edu.uweo.javaintro.tools.Turtle;

public class SmartTurtle extends Turtle
{
	
	public void makeSmallSquare()
	{
		paint( 90, 10 );
		paint( 90, 10 );
		paint( 90, 10 );
		paint( 90, 10 );
	}
	
	public void makeBigSquare()
	{
		paint( 90, 40 );
		paint( 90, 40 );
		paint( 90, 40 );
		paint( 90, 40 );
	}
	
	public void makeHexagon()
	{
		paint(0, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
		paint(60, 30);
	}

	public void spiralAnimation()
        {	
		int val = 0;

		while (val<20)
		{		
                switchTo( Turtle.GREEN );
                fillCircle( 60 );
                sleep( 200 );
                move(0, 10);
		move(30, 20);
                switchTo( Turtle.BLUE );
                fillCircle( 60 );
		sleep( 200 );
		move(0, 10);
                move(30, 20);
		val++;
//              switchTo( Turtle.GREEN );
//              fillCircle( 60 );
//		sleep( 500 );
//		move(0, 10);
//              move(30, 20);
//		switchTo( Turtle.BLUE );
//		fillCircle( 60 );
//              sleep( 500 );
//              move(0, 10);
//              move(30, 20);
//              switchTo( Turtle.GREEN );
//              fillCircle( 60 );
//		sleep( 500 );
//		move(0, 10);
//              move(30, 20);
//		switchTo( Turtle.BLUE );
//		fillCircle( 60 );
		}
	}

} 
