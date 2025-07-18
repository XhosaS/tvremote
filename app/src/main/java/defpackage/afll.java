package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afll implements afzy {
    protected final afla a;
    protected final afeh b;
    final int c;
    protected aflw d;
    protected afzw e;
    protected afzz f;
    private InputStream g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private aflj n = aflj.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public afll(afla aflaVar, afeh afehVar, int i) {
        this.a = aflaVar;
        this.b = afehVar;
        this.c = i;
    }

    private final void d() {
        aflk aflkVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (aflkVar = (aflk) this.j.get(i)) != null) {
                i++;
                if (aflkVar.d) {
                    this.i = i;
                    n();
                    return;
                }
            }
        }
    }

    private final boolean l() {
        return this.g != null || this.i > 0;
    }

    private final boolean m() {
        return this.k && this.h >= this.l;
    }

    private final void n() {
        afzw afzwVar = this.e;
        afzwVar.getClass();
        afzwVar.d();
        this.e.e();
        this.o++;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    @Override // defpackage.afzy
    public final synchronized InputStream e() {
        afle afleVar;
        InputStream inputStream = this.g;
        if (inputStream != null) {
            this.g = null;
        } else if (this.p <= 0 || !l()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                aflk aflkVar = (aflk) this.j.remove(0);
                int i2 = aflkVar.c;
                InputStream inputStream2 = aflkVar.a;
                afleVar = new afle(aflkVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int length = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr2 = ((aflk) this.j.remove(0)).b;
                    bArr[i3] = bArr2;
                    length += bArr2.length;
                }
                afleVar = new afle(bArr, length);
            }
            this.h += i;
            d();
            inputStream = afleVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (m() && !k()) {
                j(aflj.ALL_MESSAGES_DELIVERED);
                g();
                return null;
            }
        }
        return inputStream;
    }

    public final void f(Status status, Status status2, boolean z) {
        if (k()) {
            return;
        }
        boolean z2 = this.n != aflj.UNINITIALIZED;
        j(aflj.CLOSED);
        if (z2) {
            this.e.i();
        }
        if (!z) {
            afla aflaVar = this.a;
            int i = this.c;
            try {
                aflx aflxVarB = aflx.b();
                try {
                    aflxVarB.a().writeInt(0);
                    afma.b(aflxVarB.a(), afma.a(aflxVarB.a(), status) | 8);
                    aflaVar.k(i, aflxVarB);
                    aflxVarB.close();
                } finally {
                }
            } catch (StatusException e) {
                afla.b.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            a(status2);
        }
        this.a.m(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            aflj r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            afzz r1 = r4.f
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            afzz r1 = r4.f
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.l()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.m()
            if (r1 == 0) goto L70
        L37:
            aflj r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.l()
            if (r1 == 0) goto L5a
            r4.r = r0
            afzz r1 = r4.f
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aflj r1 = defpackage.aflj.ALL_MESSAGES_DELIVERED
            r4.j(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            aflj r1 = defpackage.aflj.SUFFIX_DELIVERED
            r4.j(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.g():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[Catch: StatusException -> 0x0127, all -> 0x012f, TryCatch #0 {StatusException -> 0x0127, blocks: (B:8:0x000a, B:10:0x0017, B:12:0x0023, B:13:0x002b, B:16:0x0030, B:18:0x0044, B:20:0x004e, B:22:0x0052, B:24:0x005c, B:25:0x005f, B:29:0x0066, B:31:0x006a, B:34:0x0070, B:36:0x0074, B:40:0x007b, B:41:0x0089, B:42:0x0092, B:44:0x00a3, B:45:0x00ac, B:47:0x00b4, B:49:0x00c2, B:50:0x00c8, B:51:0x00d1, B:52:0x00e9, B:54:0x00ec, B:55:0x00f0, B:57:0x00f4, B:59:0x00f8, B:62:0x0100, B:63:0x0108, B:66:0x0117, B:67:0x0122), top: B:77:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: StatusException -> 0x0127, all -> 0x012f, TryCatch #0 {StatusException -> 0x0127, blocks: (B:8:0x000a, B:10:0x0017, B:12:0x0023, B:13:0x002b, B:16:0x0030, B:18:0x0044, B:20:0x004e, B:22:0x0052, B:24:0x005c, B:25:0x005f, B:29:0x0066, B:31:0x006a, B:34:0x0070, B:36:0x0074, B:40:0x007b, B:41:0x0089, B:42:0x0092, B:44:0x00a3, B:45:0x00ac, B:47:0x00b4, B:49:0x00c2, B:50:0x00c8, B:51:0x00d1, B:52:0x00e9, B:54:0x00ec, B:55:0x00f0, B:57:0x00f4, B:59:0x00f8, B:62:0x0100, B:63:0x0108, B:66:0x0117, B:67:0x0122), top: B:77:0x000a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void h(android.os.Parcel r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afll.h(android.os.Parcel):void");
    }

    final void i(aflw aflwVar, afzz afzzVar) {
        this.d = aflwVar;
        this.e = aflwVar.e;
        this.f = afzzVar;
        if (k()) {
            return;
        }
        j(aflj.INITIALIZED);
    }

    protected final void j(aflj afljVar) {
        aflj afljVar2 = this.n;
        int iOrdinal = afljVar.ordinal();
        if (iOrdinal == 1) {
            yqw.ai(afljVar2 == aflj.UNINITIALIZED, "%s -> %s", afljVar2, afljVar);
        } else if (iOrdinal == 2) {
            yqw.ai(afljVar2 == aflj.INITIALIZED || afljVar2 == aflj.UNINITIALIZED, "%s -> %s", afljVar2, afljVar);
        } else if (iOrdinal == 3) {
            yqw.ai(afljVar2 == aflj.PREFIX_DELIVERED, "%s -> %s", afljVar2, afljVar);
        } else if (iOrdinal == 4) {
            yqw.ai(afljVar2 == aflj.ALL_MESSAGES_DELIVERED, "%s -> %s", afljVar2, afljVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.n = afljVar;
    }

    protected final boolean k() {
        return this.n == aflj.CLOSED;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String strValueOf = String.valueOf(this.n);
        boolean zL = l();
        afzz afzzVar = this.f;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zL);
        sb.append("/Lis=");
        sb.append(afzzVar != null);
        sb.append("]");
        return sb.toString();
    }
}
