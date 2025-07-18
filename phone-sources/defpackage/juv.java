package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class juv implements mvj {
    public final /* synthetic */ yjv a;
    private final /* synthetic */ int b;

    public /* synthetic */ juv(yjv yjvVar, int i) {
        this.b = i;
        this.a = yjvVar;
    }

    @Override // defpackage.mvj
    public final void a(Map map) {
        if (this.b != 0) {
            this.a.a(map);
        } else {
            this.a.a(map.get("library_sort_options"));
        }
    }
}
