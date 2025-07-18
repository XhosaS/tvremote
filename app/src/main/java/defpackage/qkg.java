package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qkg implements daj {
    public static qkg c(Object obj, vko vkoVar) {
        vpq vpqVar = (vpq) obj;
        return new qjy(new qju((vpqVar.b().b & 32) != 0 ? vpqVar.b().h : vpqVar.b().c, vpqVar.b().g, vpqVar.b().d, vpqVar.b().h, ((String) ((yqz) vkoVar.a).a).equals(vpqVar.b().j)));
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b().toString().getBytes(a));
    }

    public abstract qjx b();

    public final String toString() {
        return "qkg:" + super.toString();
    }
}
