package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afz {
    public Object a;
    public Object b;

    public afz() {
    }

    public final aga a() {
        if (this.b == null) {
            this.b = new qo();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new aga((qo) this.b, (Looper) this.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xd] */
    public final void b(xf xfVar, xa xaVar) {
        xb xbVarA = xaVar.a();
        this.a = qq.e((xb) this.a, xbVarA);
        this.b.a(xfVar, xaVar);
        this.a = xbVarA;
    }

    public final void c() {
        Object obj = this.a;
        if (obj != null) {
            Arrays.fill((int[]) obj, -1);
        }
        this.b = null;
    }

    public final void d(int i) {
        Object obj = this.a;
        if (obj == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.a = iArr;
            Arrays.fill(iArr, -1);
            return;
        }
        int[] iArr2 = (int[]) obj;
        int length = iArr2.length;
        if (i >= length) {
            while (length <= i) {
                length += length;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            int length2 = iArr2.length;
            System.arraycopy(obj, 0, iArr3, 0, length2);
            int[] iArr4 = (int[]) this.a;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public afz(xe xeVar, xb xbVar) {
        Object xnVar;
        xbVar.getClass();
        xh xhVar = xh.a;
        boolean z = xeVar instanceof xd;
        boolean z2 = xeVar instanceof wv;
        if (z && z2) {
            xnVar = new ww((wv) xeVar, (xd) xeVar);
        } else if (z2) {
            xnVar = new ww((wv) xeVar, null);
        } else if (z) {
            xnVar = (xd) xeVar;
        } else {
            Class<?> cls = xeVar.getClass();
            if (xh.a.a(cls) == 2) {
                Object obj = xh.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    xnVar = new xr(xh.b((Constructor) list.get(0), xeVar), 2);
                } else {
                    int size = list.size();
                    wx[] wxVarArr = new wx[size];
                    for (int i = 0; i < size; i++) {
                        wxVarArr[i] = xh.b((Constructor) list.get(i), xeVar);
                    }
                    xnVar = new xr(wxVarArr, 1);
                }
            } else {
                xnVar = new xn(xeVar);
            }
        }
        this.b = xnVar;
        this.a = xbVar;
    }
}
