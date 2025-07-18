package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wbu extends agvw implements agux {
    public static final wbu a = new wbu();

    public wbu() {
        super(1, MessageLite.class, "toByteArray", "toByteArray()[B", 0);
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        messageLite.getClass();
        return messageLite.toByteArray();
    }
}
