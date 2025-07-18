package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hku implements hkq {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final fse j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public hks f = new hks();

    public hku(fse fseVar, hks hksVar, ByteBuffer byteBuffer, int i) {
        this.j = fseVar;
        c(hksVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hod, java.lang.Object] */
    private final Bitmap e() {
        Boolean bool = this.h;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.i;
        Bitmap bitmapB = this.j.b.b(this.t, this.s, config);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v48, types: [short] */
    /* JADX WARN: Type inference failed for: r2v50 */
    @Override // defpackage.hkq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hku.a():android.graphics.Bitmap");
    }

    @Override // defpackage.hkq
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(hks hksVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.cf(i, "Sample size must be >=0, not: "));
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        this.q = 0;
        this.f = hksVar;
        this.e = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.p = false;
        Iterator it = hksVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((hkr) it.next()).g == 3) {
                this.p = true;
                break;
            }
        }
        this.r = iHighestOneBit;
        int i2 = hksVar.f;
        this.t = i2 / iHighestOneBit;
        int i3 = hksVar.g;
        this.s = i3 / iHighestOneBit;
        fse fseVar = this.j;
        this.c = fseVar.D(i2 * i3);
        this.d = (int[]) ((hok) fseVar.a).a(this.t * this.s, int[].class);
    }
}
