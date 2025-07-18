package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esc extends ehv {
    private final ehk f;
    private final ArrayDeque g;
    private boolean h;
    private boolean i;
    private esa j;
    private long k;
    private long l;
    private int m;
    private int n;
    private dze o;
    private erw p;
    private ehk q;
    private ImageOutput r;
    private Bitmap s;
    private boolean t;
    private esb u;
    private esb v;
    private int w;
    private boolean x;
    private final zlj y;

    public esc(zlj zljVar) {
        super(4);
        this.y = zljVar;
        this.r = W(null);
        this.f = new ehk(0);
        this.j = esa.a;
        this.g = new ArrayDeque();
        this.l = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.m = 0;
        this.n = 1;
    }

    private static ImageOutput W(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.a : imageOutput;
    }

    private final void X() {
        this.q = null;
        this.m = 0;
        this.l = -9223372036854775807L;
        erw erwVar = this.p;
        if (erwVar != null) {
            erwVar.f();
            this.p = null;
        }
    }

    private final void Y() {
        this.n = Math.min(this.n, 1);
    }

    private final void Z() throws eii {
        if (this.x) {
            dze dzeVar = this.o;
            dzeVar.getClass();
            zlj zljVar = this.y;
            int iO = zlj.o(dzeVar);
            if (iO != clw.F(4) && iO != clw.F(3)) {
                throw h(new erx(), this.o, 4005);
            }
            erw erwVar = this.p;
            if (erwVar != null) {
                erwVar.f();
            }
            this.p = new erv((Context) zljVar.b, zljVar.a);
            this.x = false;
        }
    }

    @Override // defpackage.ehv
    protected final void A() {
        X();
        Y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.ehv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void D(defpackage.dze[] r5, long r6, long r8, defpackage.evz r10) {
        /*
            r4 = this;
            esa r5 = r4.j
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.g
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.l
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.k
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            esa r6 = new esa
            long r0 = r4.l
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            esa r5 = new esa
            r5.<init>(r0, r8)
            r4.j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esc.D(dze[], long, long, evz):void");
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "ImageRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r16 = -1;
        r20 = 30000;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ff A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0222 A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228 A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ac A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x018d A[EDGE_INSN: B:184:0x018d->B:198:? BREAK  A[LOOP:0: B:18:0x0047->B:83:0x0185], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169 A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183 A[Catch: erx -> 0x02e4, TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b5 A[Catch: erx -> 0x02e4, PHI: r8
  0x01b5: PHI (r8v11 ehk) = (r8v10 ehk), (r8v23 ehk) binds: [B:96:0x01a9, B:98:0x01b3] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {erx -> 0x02e4, blocks: (B:17:0x0042, B:18:0x0047, B:20:0x004e, B:84:0x018d, B:86:0x0191, B:170:0x02e0, B:89:0x0197, B:91:0x019f, B:93:0x01a3, B:95:0x01a7, B:97:0x01ab, B:99:0x01b5, B:101:0x01b9, B:102:0x01d2, B:106:0x01dc, B:108:0x01e7, B:117:0x01ff, B:118:0x0217, B:120:0x0222, B:158:0x029c, B:160:0x02a7, B:161:0x02ac, B:163:0x02bd, B:165:0x02c8, B:164:0x02c0, B:121:0x0228, B:123:0x023b, B:125:0x0244, B:129:0x024d, B:131:0x0251, B:137:0x025e, B:139:0x026c, B:141:0x0272, B:152:0x028d, B:157:0x0296, B:112:0x01f0, B:168:0x02cd, B:23:0x0058, B:25:0x005c, B:28:0x0062, B:30:0x006f, B:32:0x0075, B:34:0x0079, B:35:0x0085, B:37:0x0090, B:38:0x0093, B:39:0x00a1, B:41:0x00a5, B:43:0x00a9, B:45:0x00ad, B:47:0x00b8, B:52:0x00c1, B:55:0x00c6, B:62:0x010f, B:67:0x0129, B:68:0x012e, B:72:0x0135, B:73:0x0148, B:75:0x0150, B:77:0x015c, B:78:0x0165, B:80:0x0169, B:83:0x0185, B:82:0x0183, B:59:0x00d1, B:61:0x010d, B:60:0x0106), top: B:175:0x0042 }] */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(long r18, long r20) throws defpackage.eii {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esc.V(long, long):void");
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return this.i;
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        int i = this.n;
        if (i != 3) {
            return i == 0 && this.t;
        }
        return true;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        return zlj.o(dzeVar);
    }

    @Override // defpackage.ehv, defpackage.ejz
    public final void s(int i, Object obj) {
        if (i != 15) {
            return;
        }
        this.r = W(obj instanceof ImageOutput ? (ImageOutput) obj : null);
    }

    @Override // defpackage.ehv
    protected final void v() {
        this.o = null;
        this.j = esa.a;
        this.g.clear();
        X();
        this.r.a();
    }

    @Override // defpackage.ehv
    protected final void w(boolean z, boolean z2) {
        this.n = z2 ? 1 : 0;
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) {
        Y();
        this.i = false;
        this.h = false;
        this.s = null;
        this.u = null;
        this.v = null;
        this.t = false;
        this.q = null;
        erw erwVar = this.p;
        if (erwVar != null) {
            erwVar.d();
        }
        this.g.clear();
    }

    @Override // defpackage.ehv
    protected final void y() {
        X();
    }
}
