package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlj {
    private static zlj c;
    public int a;
    public final Object b;

    public zlj() {
        this.b = new int[10];
    }

    public static synchronized zlj n() {
        if (c == null) {
            c = new zlj((byte[]) null);
        }
        return c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1.equals("image/png") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r1.equals("image/bmp") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r1.equals("image/webp") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.equals("image/jpeg") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        return defpackage.clw.F(4);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int o(defpackage.dze r1) {
        /*
            java.lang.String r1 = r1.Y
            if (r1 == 0) goto L6b
            boolean r0 = defpackage.eae.n(r1)
            if (r0 != 0) goto Lb
            goto L6b
        Lb:
            java.lang.String r0 = defpackage.edt.a
            int r0 = r1.hashCode()
            switch(r0) {
                case -1487656890: goto L51;
                case -1487464693: goto L42;
                case -1487464690: goto L39;
                case -1487394660: goto L30;
                case -1487018032: goto L27;
                case -879272239: goto L1e;
                case -879258763: goto L15;
                default: goto L14;
            }
        L14:
            goto L65
        L15:
            java.lang.String r0 = "image/png"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            goto L5f
        L1e:
            java.lang.String r0 = "image/bmp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            goto L5f
        L27:
            java.lang.String r0 = "image/webp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            goto L5f
        L30:
            java.lang.String r0 = "image/jpeg"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            goto L5f
        L39:
            java.lang.String r0 = "image/heif"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            goto L4a
        L42:
            java.lang.String r0 = "image/heic"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L65
            goto L5f
        L51:
            java.lang.String r0 = "image/avif"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L65
        L5f:
            r1 = 4
            int r1 = defpackage.clw.F(r1)
            return r1
        L65:
            r1 = 1
            int r1 = defpackage.clw.F(r1)
            return r1
        L6b:
            r1 = 0
            int r1 = defpackage.clw.F(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlj.o(dze):int");
    }

    public final String a() {
        int i = this.a;
        if (i == -1) {
            return null;
        }
        String str = (String) this.b;
        int iIndexOf = str.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = str.substring(this.a);
            this.a = -1;
            return strSubstring;
        }
        String strSubstring2 = str.substring(this.a, iIndexOf);
        this.a = iIndexOf + 1;
        return strSubstring2;
    }

    public final boolean b() {
        return this.a != -1;
    }

    public final int c(int i) {
        return ((int[]) this.b)[i];
    }

    public final int d() {
        if ((this.a & 2) != 0) {
            return ((int[]) this.b)[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.a & 128) != 0) {
            return ((int[]) this.b)[7];
        }
        return 65535;
    }

    public final int f() {
        return (this.a & 16) != 0 ? ((int[]) this.b)[4] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public final boolean g(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void h(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        ((int[]) this.b)[i] = i2;
    }

    public final void i(zlj zljVar) {
        zljVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (zljVar.g(i)) {
                h(i, zljVar.c(i));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final zco j() {
        if (!k()) {
            throw new NoSuchElementException();
        }
        ?? r0 = this.b;
        int i = this.a;
        this.a = i + 1;
        return (zco) r0.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final boolean k() {
        return this.a < this.b.size();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized List l() {
        this.a++;
        return this.b;
    }

    public final synchronized void m() {
    }

    public final Object p() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void q(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public zlj(Context context) {
        this.b = context;
        this.a = -1;
    }

    public zlj(Object obj) {
        this.b = obj;
        this.a = 0;
    }

    public zlj(List list) {
        this.b = list;
    }

    public zlj(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new Object[256];
    }

    public zlj(byte[] bArr) {
        this.b = Collections.EMPTY_LIST;
        this.a = 0;
    }

    public zlj(char[] cArr) {
        this.b = new ReentrantLock();
    }
}
