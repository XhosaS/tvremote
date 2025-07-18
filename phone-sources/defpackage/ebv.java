package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ebv implements ebu {
    protected ebs b;
    protected ebs c;
    public ByteBuffer d;
    private ebs e;
    private ebs f;
    private ByteBuffer g;
    private boolean h;

    public ebv() {
        ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.d = byteBuffer;
        ebs ebsVar = ebs.a;
        this.e = ebsVar;
        this.f = ebsVar;
        this.b = ebsVar;
        this.c = ebsVar;
    }

    @Override // defpackage.ebu
    public final ebs a(ebs ebsVar) {
        this.e = ebsVar;
        this.f = i(ebsVar);
        return g() ? this.f : ebs.a;
    }

    @Override // defpackage.ebu
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.ebu
    public final void c() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        k();
    }

    @Override // defpackage.ebu
    public final void d() {
        this.h = true;
        l();
    }

    @Override // defpackage.ebu
    public final void f() {
        c();
        this.g = a;
        ebs ebsVar = ebs.a;
        this.e = ebsVar;
        this.f = ebsVar;
        this.b = ebsVar;
        this.c = ebsVar;
        m();
    }

    @Override // defpackage.ebu
    public boolean g() {
        return this.f != ebs.a;
    }

    @Override // defpackage.ebu
    public boolean h() {
        return this.h && this.d == a;
    }

    protected ebs i(ebs ebsVar) {
        throw null;
    }

    protected final ByteBuffer j(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }
}
