package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lew extends LinkedHashMap {
    final /* synthetic */ lex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lew(lex lexVar, int i) {
        super(i, 0.75f, true);
        this.a = lexVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        lex lexVar = this.a;
        if (lexVar.a.size() <= 20) {
            return false;
        }
        lexVar.d(entry.getKey());
        return false;
    }
}
