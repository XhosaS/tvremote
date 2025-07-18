package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epm {
    public final Object a;
    public final Object b;

    public epm(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void a(String str, long j, long j2) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new fcd(this, str, j, j2, 0));
        }
    }

    public final void b(String str) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new eoy(this, str, 15, null));
        }
    }

    public final void c(ehw ehwVar) {
        ehwVar.a();
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new eoy(this, ehwVar, 14));
        }
    }

    public final void d(int i, long j) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new fce(this, i, j, 1));
        }
    }

    public final void e(ehw ehwVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new eoy(this, ehwVar, 13));
        }
    }

    public final void f(dze dzeVar, ehx ehxVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new bd((Object) this, (Object) dzeVar, (Object) ehxVar, 7, (short[]) null));
        }
    }

    public final void g(Object obj) {
        Object obj2 = this.a;
        if (obj2 != null) {
            ((Handler) obj2).post(new jcp(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public final void h(Exception exc) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new eoy(this, exc, 12, null));
        }
    }

    public final void i(ebo eboVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new eoy(this, eboVar, 11));
        }
    }

    public final void j(long j) {
        int i = 0;
        while (true) {
            eww[] ewwVarArr = (eww[]) this.a;
            if (i >= ewwVarArr.length) {
                return;
            }
            ewwVarArr[i].C(j);
            i++;
        }
    }

    public final fel k(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                edb.c("BaseMediaChunkOutput", a.cf(i, "Unmatched track of type: "));
                return new fdm();
            }
            if (i == iArr[i2]) {
                return ((eww[]) this.a)[i2];
            }
            i2++;
        }
    }

    public epm(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public epm(eba ebaVar, int... iArr) {
        this(ebaVar, iArr, (byte[]) null);
    }

    public epm(eba ebaVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            edb.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = ebaVar;
        this.b = iArr;
    }

    public epm(Handler handler, fcf fcfVar) {
        if (fcfVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = fcfVar;
    }
}
