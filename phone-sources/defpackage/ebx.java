package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebx implements ebu {
    public float b = 1.0f;
    public float c = 1.0f;
    public ebs d;
    public ebs e;
    public boolean f;
    public ebw g;
    public long h;
    public long i;
    private int j;
    private ebs k;
    private ebs l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;

    public ebx() {
        ebs ebsVar = ebs.a;
        this.k = ebsVar;
        this.l = ebsVar;
        this.d = ebsVar;
        this.e = ebsVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = byteBuffer;
        this.j = -1;
    }

    @Override // defpackage.ebu
    public final ebs a(ebs ebsVar) throws ebt {
        if (ebsVar.d != 2) {
            throw new ebt(ebsVar);
        }
        int i = this.j;
        if (i == -1) {
            i = ebsVar.b;
        }
        this.k = ebsVar;
        ebs ebsVar2 = new ebs(i, ebsVar.c, 2);
        this.l = ebsVar2;
        this.f = true;
        return ebsVar2;
    }

    @Override // defpackage.ebu
    public final ByteBuffer b() {
        int iA;
        ebw ebwVar = this.g;
        if (ebwVar != null && (iA = ebwVar.a()) > 0) {
            if (this.m.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.m = byteBufferOrder;
                this.n = byteBufferOrder.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            a.ab(ebwVar.i >= 0);
            int iRemaining = shortBuffer.remaining();
            int i = ebwVar.a;
            int iMin = Math.min(iRemaining / i, ebwVar.i);
            int i2 = iMin * i;
            shortBuffer.put(ebwVar.h, 0, i2);
            int i3 = ebwVar.i - iMin;
            ebwVar.i = i3;
            short[] sArr = ebwVar.h;
            System.arraycopy(sArr, i2, sArr, 0, i3 * i);
            this.i += iA;
            this.m.limit(iA);
            this.o = this.m;
        }
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.ebu
    public final void c() {
        if (g()) {
            this.d = this.k;
            this.e = this.l;
            if (this.f) {
                ebs ebsVar = this.d;
                this.g = new ebw(ebsVar.b, ebsVar.c, this.b, this.c, this.e.b);
            } else {
                ebw ebwVar = this.g;
                if (ebwVar != null) {
                    ebwVar.g = 0;
                    ebwVar.i = 0;
                    ebwVar.j = 0;
                    ebwVar.k = 0;
                    ebwVar.l = 0;
                    ebwVar.m = 0;
                    ebwVar.n = 0;
                    ebwVar.o = 0;
                    ebwVar.p = 0;
                    ebwVar.q = 0;
                    ebwVar.r = 0.0d;
                }
            }
        }
        this.o = a;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.ebu
    public final void d() {
        ebw ebwVar = this.g;
        if (ebwVar != null) {
            int i = ebwVar.g;
            int i2 = ebwVar.m;
            int i3 = i - i2;
            double d = i2;
            float f = ebwVar.c;
            float f2 = ebwVar.b;
            int i4 = ebwVar.i + ((int) ((((((i3 / (f2 / f)) + d) + ebwVar.r) + ebwVar.j) / (ebwVar.d * f)) + 0.5d));
            ebwVar.r = 0.0d;
            int i5 = ebwVar.e;
            int i6 = i5 + i5;
            ebwVar.f = ebwVar.c(ebwVar.f, i, i + i6);
            int i7 = 0;
            while (true) {
                int i8 = ebwVar.a;
                if (i7 >= i6 * i8) {
                    break;
                }
                ebwVar.f[(i8 * i) + i7] = 0;
                i7++;
            }
            ebwVar.g += i6;
            ebwVar.b();
            if (ebwVar.i > i4) {
                ebwVar.i = Math.max(i4, 0);
            }
            ebwVar.g = 0;
            ebwVar.m = 0;
            ebwVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.ebu
    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ebw ebwVar = this.g;
            ebwVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.h += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = ebwVar.a;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            ebwVar.f = ebwVar.c(ebwVar.f, ebwVar.g, i2);
            shortBufferAsShortBuffer.get(ebwVar.f, ebwVar.g * i, (i3 + i3) / 2);
            ebwVar.g += i2;
            ebwVar.b();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.ebu
    public final void f() {
        this.b = 1.0f;
        this.c = 1.0f;
        ebs ebsVar = ebs.a;
        this.k = ebsVar;
        this.l = ebsVar;
        this.d = ebsVar;
        this.e = ebsVar;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = byteBuffer;
        this.j = -1;
        this.f = false;
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.p = false;
    }

    @Override // defpackage.ebu
    public final boolean g() {
        if (this.l.b != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.l.b != this.k.b;
        }
        return false;
    }

    @Override // defpackage.ebu
    public final boolean h() {
        if (!this.p) {
            return false;
        }
        ebw ebwVar = this.g;
        return ebwVar == null || ebwVar.a() == 0;
    }
}
