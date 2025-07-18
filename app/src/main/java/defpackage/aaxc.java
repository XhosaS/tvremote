package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaxc implements agow {
    final /* synthetic */ Context a;
    final /* synthetic */ agow b;
    final /* synthetic */ agow c;
    private aaww d = null;

    public aaxc(Context context, agow agowVar, agow agowVar2) {
        this.a = context;
        this.b = agowVar;
        this.c = agowVar2;
    }

    @Override // defpackage.agow
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aaww a() {
        if (this.d == null) {
            Context context = this.a;
            agow agowVar = this.b;
            agow agowVar2 = this.c;
            String packageName = context.getPackageName();
            Object objA = agowVar.a();
            agowVar2.a();
            this.d = new aaww(packageName, (String) objA);
        }
        return this.d;
    }
}
