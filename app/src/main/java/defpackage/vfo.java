package defpackage;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ValidationResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfo {
    private final vhq a;

    public vfo(vhq vhqVar) {
        this.a = vhqVar;
    }

    public final zyd a(AccountId accountId) {
        zyd zydVarG = this.a.g(accountId);
        yqi yqiVarA = wyo.a(new yqi() { // from class: vfl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                throw new vfq();
            }
        });
        zwk zwkVar = zwk.a;
        return zuz.g(zud.g(zydVarG, IllegalArgumentException.class, yqiVarA, zwkVar), wyo.a(new yqi() { // from class: vfm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return ValidationResult.d();
                }
                throw new vfq();
            }
        }), zwkVar);
    }
}
