package defpackage;

import android.net.NetworkInfo;
import android.os.Build;
import com.google.common.collect.ImmutableCollection;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqr {
    public final boolean a;
    public final Object b;

    public xqr(NetworkInfo networkInfo, boolean z) {
        this.b = networkInfo;
        this.a = z;
    }

    public static boolean d(int i) {
        int i2 = i & 4080;
        return i2 == 16 || i2 == 128 || i2 == 224;
    }

    public final uhp a(Callable callable, Executor executor) {
        return new ugj((ImmutableCollection) this.b, this.a, executor, callable);
    }

    public final uhp b(ufv ufvVar, Executor executor) {
        return new ugj((ImmutableCollection) this.b, this.a, executor, ufvVar);
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        if (charSequence != null) {
            ((ArrayDeque) this.b).add(new zfd(i, i2, charSequence.toString()));
        }
    }

    public final boolean e(int i, int i2, CharSequence charSequence) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) this.b;
            if (arrayDeque.isEmpty()) {
                arrayDeque.add(new zfd(i, i2, charSequence.toString()));
                return false;
            }
            zfd zfdVar = (zfd) arrayDeque.peek();
            if (zfdVar.b == i && zfdVar.a == i2) {
                String str = (String) zfdVar.c;
                if (this.a) {
                    if (str.length() == charSequence.length()) {
                        return true;
                    }
                } else if (str.contentEquals(charSequence)) {
                    return true;
                }
            }
            arrayDeque.remove();
        }
    }

    public final int f() {
        Object obj = this.b;
        if (obj == null) {
            return -1;
        }
        return ((NetworkInfo) obj).getSubtype();
    }

    public final int g() {
        Object obj = this.b;
        if (obj == null) {
            return -1;
        }
        return ((NetworkInfo) obj).getType();
    }

    public final boolean h() {
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        int type = networkInfo.getType();
        if (type != 0) {
            return type == 1 || type == 6 || type == 9;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 13 || subtype == 18) {
            return true;
        }
        return subtype == 20 && this.a && Build.VERSION.SDK_INT >= 29;
    }

    public final boolean i() {
        Object obj = this.b;
        if (obj == null) {
            return false;
        }
        int type = ((NetworkInfo) obj).getType();
        return type == 0 || type == 2 || type == 3 || type == 4 || type == 5;
    }

    public final boolean j() {
        Object obj = this.b;
        return obj != null && ((NetworkInfo) obj).isConnected();
    }

    public final boolean k() {
        Object obj = this.b;
        return obj != null && ((NetworkInfo) obj).getType() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L3b
            if (r7 < 0) goto L3b
            int r0 = r6.length()
            int r0 = r0 - r7
            if (r0 < 0) goto L3b
            java.lang.Object r0 = r5.b
            if (r0 != 0) goto L10
            goto L36
        L10:
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L14:
            r4 = 1
            if (r2 >= r7) goto L32
            if (r3 != r1) goto L32
            char r3 = r6.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            if (r3 == 0) goto L2e
            if (r3 == r4) goto L2c
            if (r3 == r1) goto L2c
            switch(r3) {
                case 14: goto L2e;
                case 15: goto L2e;
                case 16: goto L2c;
                case 17: goto L2c;
                default: goto L2a;
            }
        L2a:
            r3 = r1
            goto L2f
        L2c:
            r3 = r0
            goto L2f
        L2e:
            r3 = r4
        L2f:
            int r2 = r2 + 1
            goto L14
        L32:
            if (r3 == 0) goto L3a
            if (r3 == r4) goto L39
        L36:
            boolean r6 = r5.a
            return r6
        L39:
            return r0
        L3a:
            return r4
        L3b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqr.l(java.lang.CharSequence, int):boolean");
    }

    public xqr(Object obj) {
        this.b = obj;
        this.a = false;
    }

    public xqr(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public xqr(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public xqr(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public xqr(int i) {
        this.b = new ArrayDeque();
        this.a = d(i);
    }
}
