package defpackage;

import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msq implements eeq {
    public final int a;
    public final int b;
    private final eef e;
    private FlowLayoutManager f;
    private float g;
    private float h;
    public int c = Integer.MAX_VALUE;
    public int d = 1;
    private final int i = -1;

    public msq(int i, int i2, float f, float f2, eef eefVar) {
        this.g = 0.0f;
        this.h = 0.0f;
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.a = i;
        this.b = i2;
        this.h = f;
        this.g = f2;
        this.e = eefVar == null ? msp.a : eefVar;
    }

    @Override // defpackage.eeq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eeq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.eeq
    public final rh c() {
        return ekb.a(this.b, this.c, this.d);
    }

    @Override // defpackage.eeq
    public final eef d() {
        return this.e;
    }

    @Override // defpackage.eeq
    public final egy e(dru druVar) {
        if (this.f == null) {
            msj msjVar = new msj(druVar.a);
            msjVar.b = this.a;
            msjVar.c = this.h;
            msjVar.d = this.g;
            msjVar.e = -1;
            this.f = new FlowLayoutManager(msjVar);
        }
        return new mso(this.f);
    }
}
