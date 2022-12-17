public class Bullet {
    private double speed;
    private double angle;
    private Point p;
    private double Ax;
    private double Ay;
    private boolean enable;
    public Bullet (double angle, Point p){
        enable = true;
        speed = Config.SPEED_BULLET;
        this.angle = angle;
        this.p = p;
        Ax= speed * Math.cos(angle);
        Ay = speed * Math.sin(angle);
    }
    public void uptate Location () {
        p.setX(p.getX+(int) Ax);
        p.setY(p.getY+(int) Ay);
        if(p.get x<0 ||
        p.getX>Config.SRE.SCREN||)
        p.getY < 0 ||
        p.getY >config.SIZE_SCREEN_Y {
            enable = false
        }
    }
