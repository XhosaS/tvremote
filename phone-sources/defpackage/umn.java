package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class umn implements ume {
    private final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.umb
    public final void a(Object obj, Object obj2) {
        if (this.a == 0) {
            throw new umc("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
        Map.Entry entry = (Map.Entry) obj;
        obj2.b(umm.a, entry.getKey());
        obj2.b(umm.b, entry.getValue());
    }
}
