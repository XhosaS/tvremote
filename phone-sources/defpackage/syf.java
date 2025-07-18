package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syf extends csm {
    final /* synthetic */ syi a;
    final /* synthetic */ syh b;

    public syf(syh syhVar, syi syiVar) {
        this.a = syiVar;
        this.b = syhVar;
    }

    @Override // defpackage.csm
    /* renamed from: onFontRetrievalFailed */
    public final void m339xb24343b7(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.csm
    /* renamed from: onFontRetrieved */
    public final void m340x46c88379(Typeface typeface) {
        syh syhVar = this.b;
        syhVar.m = Typeface.create(typeface, syhVar.d);
        syhVar.o = true;
        this.a.b(syhVar.m, false);
    }
}
