package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes.dex */
class owd extends ypk {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owd(String str) {
        super(null, ypk.c, ypk.b);
        this.a = str;
    }

    @Override // defpackage.ypk
    public final yoz a() {
        return new yoz(this.a, new Date(Long.MAX_VALUE));
    }
}
