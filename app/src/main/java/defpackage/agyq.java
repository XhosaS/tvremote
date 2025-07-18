package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyq implements agxs {
    public final CharSequence a;
    public final agvb b;

    public agyq(CharSequence charSequence, agvb agvbVar) {
        this.a = charSequence;
        this.b = agvbVar;
    }

    @Override // defpackage.agxs
    public final Iterator a() {
        return new agyp(this);
    }
}
