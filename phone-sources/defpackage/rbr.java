package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbr extends rbn {
    private final qtr a;
    private final xwk b;
    private final yyh c;
    private final yyh d;

    public rbr(xwk xwkVar, yyh yyhVar, yyh yyhVar2, qtr qtrVar) {
        this.b = xwkVar;
        this.c = yyhVar;
        this.d = yyhVar2;
        this.a = qtrVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((rbq) obj2).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [qtr] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ?? r3;
        unx unxVar = (unx) obj;
        rbq rbqVar = (rbq) obj2;
        rbqVar.getClass();
        Object obj3 = unxVar.a;
        vrn vrnVar = rbqVar.a;
        if (!yks.e(obj3, vrnVar)) {
            Object obj4 = unxVar.b;
            ((AvatarView) obj4).i();
            if (rbqVar.c == 3) {
                r3 = this.a;
            } else {
                Object obj5 = this.b.b;
                r3 = obj5;
                if (obj5 == null) {
                    yks.c("avatarImageLoader");
                    r3 = 0;
                }
            }
            r3.a(vrnVar, (ImageView) obj4);
        }
        Object obj6 = unxVar.b;
        vpi vpiVar = rbqVar.b;
        vqi vqiVar = vpiVar.b;
        qum qumVar = (vqiVar == null || vqiVar.b + (-1) != 1) ? null : new qum(quq.e(((AvatarView) obj6).getContext().getResources()));
        AvatarView avatarView = (AvatarView) obj6;
        avatarView.j(qumVar);
        if (vqiVar != null) {
            vqe vqeVar = vqiVar.a;
            if (vqeVar != null) {
                yyh yyhVar = this.d;
                Context context = avatarView.getContext();
                context.getClass();
                avatarView.setContentDescription(yyhVar.k(vqeVar, context));
                avatarView.setImportantForAccessibility(1);
            } else {
                avatarView.setContentDescription(null);
                avatarView.setImportantForAccessibility(2);
            }
        }
        vpj vpjVar = vpiVar.c;
        if (vpjVar != null) {
            avatarView.setBadgeScale(1.0f);
            yyh yyhVar2 = this.c;
            Context context2 = avatarView.getContext();
            context2.getClass();
            avatarView.f(yyhVar2.g(context2, vpjVar.a));
        } else {
            avatarView.setBadgeScale(0.0f);
            avatarView.f(null);
        }
        avatarView.setAlpha(vpiVar.a);
        unxVar.a = vrnVar;
    }
}
