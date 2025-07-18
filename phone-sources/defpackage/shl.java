package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shl implements onv {
    final /* synthetic */ omi a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;

    public shl(omi omiVar, String str, Context context, String str2) {
        this.a = omiVar;
        this.b = str;
        this.c = context;
        this.d = str2;
    }

    @Override // defpackage.onv
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        new omn(this.a, this.b, this.c.getSharedPreferences("phenotype_shared_prefs", 0)).d(this.d, new shk());
    }
}
