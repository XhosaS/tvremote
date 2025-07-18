package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmd {
    public final tkm a;
    public final ImmutableSet b;
    public final int c;

    public tmd(tkm tkmVar) {
        this.a = tkmVar;
        ImmutableSet.Builder builder = ImmutableSet.builder();
        builder.add((ImmutableSet.Builder) tkmVar.c());
        if (tkmVar instanceof tkx) {
            String strE = ((tkx) tkmVar).e("bt");
            String string = strE == null ? null : new Uri.Builder().scheme("bt").encodedAuthority(strE).build().toString();
            if (string != null) {
                builder.add((ImmutableSet.Builder) string);
            }
        }
        this.b = builder.build();
        this.c = true == (tkmVar instanceof tkj) ? 2 : 1;
    }

    public final String a() {
        return this.a.b().toString();
    }

    public final boolean b(tmd tmdVar) {
        return this == tmdVar || !Collections.disjoint(this.b, tmdVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tmd) {
            return Objects.equals(this.a, ((tmd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
