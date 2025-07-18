package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozp extends oxp {
    private static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/foyer/HomeEntityCache");
    private final ozi b;
    private final oym c;

    public ozp(ozi oziVar, oym oymVar) {
        this.b = oziVar;
        this.c = oymVar;
    }

    @Override // defpackage.oxp
    public final /* synthetic */ ozl a(MessageLite messageLite) {
        abhn abhnVar = (abhn) messageLite;
        abhnVar.getClass();
        oym oymVar = this.c;
        oxn oxnVar = (oxn) oymVar.a.a();
        oxnVar.getClass();
        Set set = (Set) ((aejh) oymVar.b).b;
        set.getClass();
        ((Set) oymVar.c.a()).getClass();
        return new oyi(oxnVar, set, this.b, abhnVar);
    }

    @Override // defpackage.oxp
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        abhn abhnVar = (abhn) messageLite;
        abhnVar.getClass();
        String str = abhnVar.b;
        str.getClass();
        if (str.length() == 0) {
            ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/HomeEntityCache", "extractId", 17, "HomeEntityCache.kt")).u("Empty structure ID found");
        }
        return str;
    }
}
