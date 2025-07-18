package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public bmd(aij aijVar, yjk yjkVar) {
        this.c = aijVar;
        this.e = yjkVar;
        this.d = new Object();
        this.b = new bfz(new cam[16], 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bzz, java.lang.Object] */
    public final void a() {
        if (this.a) {
            return;
        }
        this.b.x(new agx((Object) this, 2, (char[]) null));
        this.a = true;
    }

    public final void b() {
        if (this.a) {
            return;
        }
        ((jn) ((kw) this.d).a).i();
        ((bsm) this.e).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void c(Object obj) {
        ?? r0 = this.d;
        boolean z = true;
        if (r0 != 0 && ((Boolean) r0.a()).booleanValue()) {
            e();
        }
        if (this.a) {
            this.e.a(obj);
            return;
        }
        Object obj2 = this.b;
        try {
            ((ReentrantLock) obj2).lock();
            if (!this.a) {
                this.c.add(obj);
                z = false;
            }
            if (z) {
                this.e.a(obj);
            }
        } finally {
            ((ReentrantLock) obj2).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    public final void d(Object obj) {
        Object obj2 = this.b;
        try {
            ((ReentrantLock) obj2).lock();
            this.c.remove(obj);
        } finally {
            ((ReentrantLock) obj2).unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final boolean e() {
        if (this.a) {
            return false;
        }
        Object obj = this.b;
        try {
            ((ReentrantLock) obj).lock();
            if (this.a) {
                return false;
            }
            this.a = true;
            ?? r2 = this.c;
            List listAl = yfm.al(r2);
            r2.clear();
            ((ReentrantLock) obj).unlock();
            ?? r0 = this.e;
            Iterator it = listAl.iterator();
            while (it.hasNext()) {
                r0.a(it.next());
            }
            return true;
        } finally {
            ((ReentrantLock) obj).unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199 A[Catch: all -> 0x0382, TryCatch #0 {all -> 0x0382, blocks: (B:7:0x0011, B:9:0x0027, B:11:0x003f, B:14:0x005f, B:16:0x0089, B:18:0x00a1, B:17:0x0099, B:13:0x004f, B:19:0x00ac, B:21:0x00bd, B:23:0x00ca, B:26:0x00cf, B:29:0x00d5, B:31:0x00df, B:33:0x00ea, B:89:0x026b, B:37:0x00fb, B:39:0x0113, B:41:0x0137, B:43:0x0146, B:45:0x0152, B:47:0x015d, B:52:0x0173, B:54:0x0179, B:56:0x0187, B:57:0x0190, B:63:0x01c2, B:50:0x016e, B:58:0x0199, B:60:0x01a9, B:61:0x01b2, B:66:0x01d4, B:69:0x01e0, B:71:0x01f1, B:72:0x01f4, B:74:0x01fd, B:76:0x0207, B:78:0x0223, B:80:0x023b, B:86:0x0258, B:88:0x0264, B:90:0x0275, B:129:0x032d, B:140:0x0359, B:142:0x0364, B:147:0x037a, B:145:0x0376, B:132:0x0333, B:134:0x033e, B:136:0x034e, B:139:0x0356, B:93:0x0291, B:95:0x02a1, B:101:0x02b1, B:102:0x02b4, B:104:0x02bc, B:110:0x02cc, B:111:0x02cf, B:117:0x02da, B:119:0x02e7, B:121:0x02f6, B:122:0x0305, B:123:0x0308, B:125:0x030f, B:126:0x031b, B:128:0x0322), top: B:153:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(defpackage.cpw r34, defpackage.bti r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.f(cpw, bti, boolean):int");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zdn] */
    public final void g(IOException iOException) {
        this.a = true;
        ((zcy) this.e).a(iOException);
        this.b.b().g((zdc) this.c, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zdn] */
    public final zck h() throws IOException {
        try {
            zck zckVarG = this.b.g();
            zckVarG.k = this;
            return zckVarG;
        } catch (IOException e) {
            g(e);
            throw e;
        }
    }

    public bmd(zdc zdcVar, zcy zcyVar, zdn zdnVar) {
        this.c = zdcVar;
        this.e = zcyVar;
        this.b = zdnVar;
        this.d = zdnVar.b();
    }

    public bmd(bmh bmhVar, bzz bzzVar) {
        this.c = bmhVar;
        this.b = bzzVar;
        int i = kl.a;
        byte[] bArr = null;
        this.d = new kk(bArr);
        this.e = new kk(bArr);
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public bmd(yjv yjvVar, yjk yjkVar) {
        this.e = yjvVar;
        this.d = yjkVar;
        this.b = new ReentrantLock();
        this.c = new ArrayList();
    }

    public bmd(bys bysVar) {
        this.b = bysVar;
        this.e = new bsm(bysVar.n());
        this.d = new kw((char[]) null);
        this.c = new byg();
    }
}
