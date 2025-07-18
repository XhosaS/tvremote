package j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;
    public long a;
    public int b;
    public final boolean c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    public static final ThreadLocal d = new ThreadLocal();
    public static final AtomicInteger e = new AtomicInteger();
    public static final y f = new y();
    public static final AtomicLong g = new AtomicLong(c(System.currentTimeMillis()) ^ c(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new j$.util.y(1))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    public /* synthetic */ ThreadLocalRandom(int i) {
        this();
    }

    public static final void a() {
        int iAddAndGet = e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jC = c(g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.a = jC;
        threadLocalRandom.b = iAddAndGet;
    }

    public static int b(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long c(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.b == 0) {
            a();
        }
        return threadLocalRandom;
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    public final long d() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return b(d()) < 0;
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return dNextLong;
        }
        double d4 = ((d3 - d2) * dNextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (b(d()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    public final int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        int iB = b(d());
        if (i >= i2) {
            return iB;
        }
        int i3 = i2 - i;
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return (iB & i4) + i;
        }
        if (i3 > 0) {
            int iB2 = iB >>> 1;
            while (true) {
                int i5 = iB2 + i4;
                int i6 = iB2 % i3;
                if (i5 - i6 >= 0) {
                    return i6 + i;
                }
                iB2 = b(d()) >>> 1;
            }
        } else {
            while (true) {
                if (iB >= i && iB < i2) {
                    return iB;
                }
                iB = b(d());
            }
        }
    }

    public final long nextLong(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        long jC = c(d());
        if (j >= j2) {
            return jC;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (jC & j4) + j;
        }
        if (j3 > 0) {
            long jC2 = jC >>> 1;
            while (true) {
                long j5 = jC2 + j4;
                long j6 = jC2 % j3;
                if (j5 - j6 >= 0) {
                    return j6 + j;
                }
                jC2 = c(d()) >>> 1;
            }
        } else {
            while (true) {
                if (jC >= j && jC < j2) {
                    return jC;
                }
                jC = c(d());
            }
        }
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private ThreadLocalRandom() {
        this.c = true;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (c(d()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 > 0.0d) {
            double dC = (c(d()) >>> 11) * 1.1102230246251565E-16d * d2;
            return dC < d2 ? dC : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
        }
        throw new IllegalArgumentException("bound must be positive");
    }

    @Override // java.util.Random
    public final int nextInt() {
        return b(d());
    }

    @Override // java.util.Random
    public final long nextLong() {
        return c(d());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i > 0) {
            int iB = b(d());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return iB & i2;
            }
            while (true) {
                int i3 = iB >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                iB = b(d());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public final long nextLong(long j) {
        if (j > 0) {
            long jC = c(d());
            long j2 = j - 1;
            if ((j & j2) == 0) {
                return jC & j2;
            }
            while (true) {
                long j3 = jC >>> 1;
                long j4 = j3 + j2;
                long j5 = j3 % j;
                if (j4 - j5 >= 0) {
                    return j5;
                }
                jC = c(d());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }
}
