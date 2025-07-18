package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ttg extends trl {
    final /* synthetic */ tsa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttg(uof uofVar, CharSequence charSequence, tsa tsaVar) {
        super(uofVar, charSequence);
        this.g = tsaVar;
    }

    @Override // defpackage.trl
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.trl
    public final int b(int i) {
        return this.g.h(this.b, i);
    }
}
