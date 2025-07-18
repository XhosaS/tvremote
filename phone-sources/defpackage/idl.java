package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idl implements idf {
    private final /* synthetic */ int a;

    public idl(int i) {
        this.a = i;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((ieg) obj).j();
        }
        if (i == 1) {
            return Collections.singletonList(obj);
        }
        ieg iegVar = (ieg) obj;
        return iegVar.m() ? (List) iegVar.g() : Collections.EMPTY_LIST;
    }
}
