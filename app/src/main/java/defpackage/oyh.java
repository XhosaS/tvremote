package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oyh extends oxp {
    final /* synthetic */ oyi a;

    public oyh(oyi oyiVar) {
        this.a = oyiVar;
    }

    @Override // defpackage.oxp
    public final /* bridge */ /* synthetic */ ozl a(MessageLite messageLite) {
        abhh abhhVar = (abhh) messageLite;
        abhhVar.getClass();
        oyi oyiVar = this.a;
        return new ozn(oyiVar.f, abhhVar, oyiVar.b());
    }

    @Override // defpackage.oxp
    public final /* bridge */ /* synthetic */ String c(MessageLite messageLite) {
        abhh abhhVar = (abhh) messageLite;
        abhhVar.getClass();
        String str = abhhVar.c;
        str.getClass();
        if (str.length() == 0) {
            ((zdv) oyi.a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHome$RoomEntityCache", "extractId", 1262, "FoyerHome.kt")).u("Empty space ID found");
        }
        return str;
    }
}
