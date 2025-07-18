package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyr extends ezb implements Comparable {
    private final int e;
    private final int f;

    public eyr(int i, eba ebaVar, int i2, eyv eyvVar, int i3) {
        super(i, ebaVar, i2);
        this.e = clw.N(i3, eyvVar.aA) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(eyr eyrVar) {
        return Integer.compare(this.f, eyrVar.f);
    }

    @Override // defpackage.ezb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ezb
    public final /* bridge */ /* synthetic */ boolean c(ezb ezbVar) {
        return false;
    }
}
