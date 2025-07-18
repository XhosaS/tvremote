package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqo {
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;
    private boolean f;
    private double g;
    private double h;
    private double i;
    private final aqi j;

    public aqo() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f = false;
        this.e = Double.MAX_VALUE;
        this.j = new aqi();
    }

    final aqi a(double d, double d2, long j) {
        double dCos;
        double dPow;
        if (!this.f) {
            if (this.e == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.b;
            if (d3 > 1.0d) {
                double d4 = this.a;
                this.g = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
                double d5 = this.b;
                double d6 = this.a;
                this.h = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.i = this.a * Math.sqrt(1.0d - (d3 * d3));
            }
            this.f = true;
        }
        double d7 = d - this.e;
        double d8 = this.b;
        double d9 = j / 1000.0d;
        if (d8 > 1.0d) {
            double d10 = this.h;
            double d11 = ((d10 * d7) - d2) / (d10 - this.g);
            double d12 = d7 - d11;
            double dPow2 = Math.pow(2.718281828459045d, d10 * d9) * d12;
            double dPow3 = Math.pow(2.718281828459045d, this.g * d9) * d11;
            double d13 = this.h;
            double dPow4 = d12 * d13 * Math.pow(2.718281828459045d, d13 * d9);
            double d14 = this.g;
            dCos = dPow4 + (d11 * d14 * Math.pow(2.718281828459045d, d14 * d9));
            dPow = dPow2 + dPow3;
        } else if (d8 == 1.0d) {
            double d15 = this.a;
            double d16 = d2 + (d15 * d7);
            double d17 = d7 + (d16 * d9);
            dPow = Math.pow(2.718281828459045d, (-d15) * d9) * d17;
            double dPow5 = d17 * Math.pow(2.718281828459045d, (-this.a) * d9);
            double d18 = -this.a;
            dCos = (dPow5 * d18) + (d16 * Math.pow(2.718281828459045d, d9 * d18));
        } else {
            double d19 = 1.0d / this.i;
            double d20 = this.a;
            double d21 = d19 * ((d8 * d20 * d7) + d2);
            double dPow6 = Math.pow(2.718281828459045d, (-d8) * d20 * d9) * ((Math.cos(this.i * d9) * d7) + (Math.sin(this.i * d9) * d21));
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * dPow6 * d23;
            double dPow7 = Math.pow(2.718281828459045d, (-d23) * d22 * d9);
            double d25 = this.i;
            double dSin = (-d25) * d7 * Math.sin(d25 * d9);
            double d26 = this.i;
            dCos = d24 + (dPow7 * (dSin + (d26 * d21 * Math.cos(d26 * d9))));
            dPow = dPow6;
        }
        aqi aqiVar = this.j;
        aqiVar.a = (float) (dPow + this.e);
        aqiVar.b = (float) dCos;
        return aqiVar;
    }

    public final void b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f;
        this.f = false;
    }

    public final void c(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f);
        this.f = false;
    }

    public aqo(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.f = false;
        this.e = Double.MAX_VALUE;
        this.j = new aqi();
        this.e = f;
    }
}
