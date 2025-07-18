package defpackage;

import com.google.android.libraries.onegoogle.account.disc.AvatarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbb extends rbn {
    private final rbr a;

    public rbb(rbr rbrVar) {
        this.a = rbrVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vpg) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        vpg vpgVar = (vpg) obj2;
        vpgVar.getClass();
        rbq rbqVar = new rbq(vpgVar.a, vpgVar.b);
        Object obj3 = ((ust) obj).a;
        this.a.c(obj3, rbqVar);
        ((AvatarView) ((unx) obj3).b).setImportantForAccessibility(2);
    }
}
