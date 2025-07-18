package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnr {
    final Context a;
    final eao b;
    String c;
    fnt d;
    final Bundle e;
    final Bundle f;
    ecl g;
    final ImmutableList h;
    final ImmutableList i;
    final ImmutableList j;

    public fnr(Context context, eao eaoVar) {
        jch jchVar = new jch(1);
        this.a = context;
        this.b = eaoVar;
        a.H(true);
        this.c = "";
        this.d = jchVar;
        this.e = new Bundle();
        this.f = new Bundle();
        this.h = ImmutableList.of();
        this.i = ImmutableList.of();
        this.j = ImmutableList.of();
    }

    public final fny a() {
        if (this.g == null) {
            this.g = new fna(new eeu(this.a));
        }
        Context context = this.a;
        String str = this.c;
        eao eaoVar = this.b;
        ImmutableList immutableList = this.h;
        ImmutableList immutableList2 = this.i;
        ImmutableList immutableList3 = this.j;
        fnt fntVar = this.d;
        Bundle bundle = this.e;
        Bundle bundle2 = this.f;
        ecl eclVar = this.g;
        eclVar.getClass();
        return new fny(context, str, eaoVar, immutableList, immutableList2, immutableList3, fntVar, bundle, bundle2, eclVar);
    }

    public final void b(fnt fntVar) {
        fntVar.getClass();
        this.d = fntVar;
    }

    public final void c(String str) {
        str.getClass();
        this.c = str;
    }
}
