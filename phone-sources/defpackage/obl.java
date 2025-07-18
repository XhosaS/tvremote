package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obl {
    public final Object a;
    public Object b;

    public obl(Context context) {
        this.a = context;
    }

    public final int a(Context context, nwj nwjVar) {
        ocv.aF(context);
        ocv.aF(nwjVar);
        int iH = 0;
        if (!nwjVar.F()) {
            return 0;
        }
        int iA = nwjVar.a();
        int iC = c(iA);
        if (iC != -1) {
            return iC;
        }
        Object obj = this.a;
        synchronized (obj) {
            int i = 0;
            while (true) {
                if (i >= ((SparseIntArray) obj).size()) {
                    iH = -1;
                    break;
                }
                int iKeyAt = ((SparseIntArray) obj).keyAt(i);
                if (iKeyAt > iA && ((SparseIntArray) obj).get(iKeyAt) == 0) {
                    break;
                }
                i++;
            }
            if (iH == -1) {
                iH = ((nvk) this.b).h(context, iA);
            }
            ((SparseIntArray) obj).put(iA, iH);
        }
        return iH;
    }

    public final void b() {
        Object obj = this.a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int c(int i) {
        int i2;
        Object obj = this.a;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public final fuy d() {
        if (this.b == null) {
            this.b = fuy.b((Context) this.a);
        }
        return (fuy) this.b;
    }

    public final void e(fus fusVar) {
        fuy fuyVarD = d();
        if (fuyVarD != null) {
            fuyVarD.f(fusVar);
        }
    }

    public final void f(fur furVar, fus fusVar) {
        d().d(furVar, fusVar, 4);
    }

    public obl(oak oakVar) {
        this.a = oakVar == null ? null : oakVar.b;
    }

    public obl() {
        this(nvj.a);
    }

    public obl(byte[] bArr) {
        this.b = "";
        this.a = new ArrayList();
    }

    public obl(nvk nvkVar) {
        this.a = new SparseIntArray();
        ocv.aF(nvkVar);
        this.b = nvkVar;
    }
}
