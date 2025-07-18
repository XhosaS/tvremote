package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.ListView;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bda {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public bda(agq agqVar, int i, agb agbVar) {
        this.c = agqVar;
        this.a = i;
        this.b = agbVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byo, java.lang.Object] */
    public final void a() {
        synchronized (bda.class) {
            if (!d) {
                ama amaVar = new ama(this, 18, null);
                long j = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                cjd cjdVar = (cjd) this.b.aL();
                tj.h(cjdVar.schedule(new bcz(amaVar, cjdVar, j, timeUnit), j, timeUnit));
                d = true;
            }
        }
    }

    public final ListView b() {
        return ((hz) this.b).e;
    }

    final czb c(int i) throws IOException {
        boolean z;
        Object obj = this.b;
        if (obj instanceof dby) {
            ((dby) obj).a(false);
        }
        InputStream inputStream = (InputStream) obj;
        int iB = czm.b(inputStream, i);
        int i2 = this.a;
        if (iB == 3 || iB == 4 || iB == 16 || iB == 17) {
            z = true;
        } else if (iB == 8) {
            iB = 8;
            z = true;
        } else {
            z = false;
        }
        int iA = czm.a(inputStream, i2, z);
        if (iA < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            int i3 = i & 192;
            bda bdaVar = new bda(new dby(inputStream, i2), i2, this.c);
            if (i3 != 0) {
                return new dba(i3, iB, bdaVar);
            }
            if (iB == 3) {
                return new dat(bdaVar);
            }
            if (iB == 4) {
                return new dbi(bdaVar, 1);
            }
            if (iB == 8) {
                return new day(bdaVar, 2);
            }
            if (iB == 16) {
                return new day(bdaVar, 1);
            }
            if (iB == 17) {
                return new day(bdaVar, 0);
            }
            throw new czf("unknown BER object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
        }
        dbw dbwVar = new dbw(inputStream, iA, i2);
        if ((i & 224) == 0) {
            if (iB == 3) {
                return new dbo(dbwVar);
            }
            if (iB == 4) {
                return new dbi(dbwVar, 0);
            }
            if (iB == 8) {
                throw new czf("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iB == 16) {
                throw new czf("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iB == 17) {
                throw new czf("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return czm.e(iB, dbwVar, (byte[][]) this.c);
            } catch (IllegalArgumentException e) {
                throw new czf("corrupted stream detected", e);
            }
        }
        int i4 = i & 192;
        bda bdaVar2 = new bda(dbwVar, dbwVar.d, this.c);
        if (i4 != 0) {
            return new dbv(i4, iB, (i & 32) != 0, bdaVar2);
        }
        if (iB == 3) {
            return new dat(bdaVar2);
        }
        if (iB == 4) {
            return new dbi(bdaVar2, 1);
        }
        if (iB == 8) {
            return new day(bdaVar2, 2);
        }
        if (iB == 16) {
            return new day(bdaVar2, 3);
        }
        if (iB == 17) {
            return new day(bdaVar2, 4);
        }
        throw new czf("unknown DL object encountered: 0x".concat(String.valueOf(Integer.toHexString(iB))));
    }

    public final czb d() throws IOException {
        int i = ((InputStream) this.b).read();
        if (i < 0) {
            return null;
        }
        return c(i);
    }

    public final czc e() throws IOException {
        InputStream inputStream = (InputStream) this.b;
        int i = inputStream.read();
        if (i < 0) {
            return new czc(0);
        }
        czc czcVar = new czc();
        do {
            czb czbVarC = c(i);
            if (czbVarC instanceof dbx) {
                czcVar.b(((dbx) czbVarC).j());
            } else {
                czcVar.b(czbVarC.p());
            }
            i = inputStream.read();
        } while (i >= 0);
        return czcVar;
    }

    public final dab f(int i, int i2) throws IOException {
        czc czcVarE = e();
        int i3 = czcVarE.c;
        if (i3 == 1) {
            return new daz(3, i, i2, czcVarE.a(0));
        }
        return new daz(4, i, i2, i3 <= 0 ? dau.a : new daw(czcVarE));
    }

    public bda(ic icVar, du duVar, int i) {
        this.b = icVar;
        this.c = duVar;
        this.a = i;
    }

    public bda(Object obj, int i, Object obj2) {
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }

    public bda(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        this.a = theme == null ? 0 : theme.hashCode();
    }

    public bda(byo byoVar) {
        azz azzVar = new azz(4);
        this.b = byoVar;
        this.a = Math.max(5, 10);
        this.c = azzVar;
    }
}
