package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulm implements uje {
    public final Context a;
    public final String b;
    public final Set c;
    public SharedPreferences d;
    private final Executor e;
    private final yrp f;
    private final uli g;

    public ulm(ulj uljVar) {
        this.a = uljVar.a;
        this.e = uljVar.b;
        this.b = uljVar.c;
        this.c = uljVar.d;
        this.g = uljVar.f;
        this.f = uljVar.e;
    }

    public static ulj d(Context context, Executor executor) {
        return new ulj(context.getApplicationContext(), executor);
    }

    @Override // defpackage.uje
    public final zyd a() {
        return ((Boolean) this.f.eV()).booleanValue() ? zxy.a : zxn.k(new Callable() { // from class: ule
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                ulm ulmVar = this.a;
                Set<String> setKeySet = ulmVar.c;
                if (setKeySet == null) {
                    setKeySet = ulmVar.d.getAll().keySet();
                }
                SharedPreferences.Editor editorEdit = ulmVar.d.edit();
                Iterator<String> it = setKeySet.iterator();
                while (it.hasNext()) {
                    editorEdit.remove(it.next());
                }
                if (editorEdit.commit()) {
                    return null;
                }
                throw new IOException("Failed to remove migrated SharedPreferences keys: ".concat(String.valueOf(ulmVar.b)));
            }
        }, this.e);
    }

    @Override // defpackage.uje
    public final zyd b(MessageLite messageLite) {
        return zxn.h(this.g.a.b(new ull(this.d, this.c), messageLite));
    }

    @Override // defpackage.uje
    public final zyd c() {
        return zxn.k(new Callable() { // from class: ulf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ulm ulmVar = this.a;
                ulmVar.d = ulmVar.a.getSharedPreferences(ulmVar.b, 0);
                Set set = ulmVar.c;
                if (set == null) {
                    return Boolean.valueOf(!ulmVar.d.getAll().isEmpty());
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (ulmVar.d.contains((String) it.next())) {
                        return true;
                    }
                }
                return false;
            }
        }, this.e);
    }
}
