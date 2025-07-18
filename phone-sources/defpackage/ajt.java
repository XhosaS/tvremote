package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajt extends bjm {
    public CharSequence a;
    public List b;
    public chb c;
    public chc d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public cmi i;
    public long j;
    public cgz k;
    public esn l;

    public ajt() {
        super(bjb.b().v());
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.j = clw.k(0, 0, 15);
    }

    @Override // defpackage.bjm
    public final bjm a() {
        return new ajt();
    }

    @Override // defpackage.bjm
    public final void b(bjm bjmVar) {
        bjmVar.getClass();
        ajt ajtVar = (ajt) bjmVar;
        this.a = ajtVar.a;
        this.b = ajtVar.b;
        this.c = ajtVar.c;
        this.d = ajtVar.d;
        this.e = ajtVar.e;
        this.f = ajtVar.f;
        this.g = ajtVar.g;
        this.h = ajtVar.h;
        this.i = ajtVar.i;
        this.l = ajtVar.l;
        this.j = ajtVar.j;
        this.k = ajtVar.k;
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.a) + ", annotations=" + this.b + ", composition=" + this.c + ", textStyle=" + this.d + ", singleLine=" + this.e + ", softWrap=" + this.f + ", densityValue=" + this.g + ", fontScale=" + this.h + ", layoutDirection=" + this.i + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) clv.e(this.j)) + ", layoutResult=" + this.k + ')';
    }
}
