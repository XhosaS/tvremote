package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aalt implements aalw, aalx {
    public final aamy a;
    public final aamy b;
    private final Context c;
    private final Set d;
    private final Executor e;

    public aalt(final Context context, final String str, Set set, aamy aamyVar, Executor executor) {
        this.a = new aamy() { // from class: aalp
            @Override // defpackage.aamy
            public final Object a() {
                return new aaly(context, str);
            }
        };
        this.d = set;
        this.e = executor;
        this.b = aamyVar;
        this.c = context;
    }

    @Override // defpackage.aalw
    public final lvf a() {
        return !adw.a(this.c) ? lvq.c("") : lvq.a(this.e, new Callable() { // from class: aalq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                aalt aaltVar = this.a;
                synchronized (aaltVar) {
                    Object objA = aaltVar.a.a();
                    List listA = ((aaly) objA).a();
                    ((aaly) objA).b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < listA.size(); i++) {
                        aalz aalzVar = (aalz) listA.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", aalzVar.a());
                        jSONObject.put("dates", new JSONArray((Collection) aalzVar.b()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.aalx
    public final synchronized int b() {
        aamy aamyVar = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = aamyVar.a();
        if (!((aaly) objA).g(jCurrentTimeMillis)) {
            return 1;
        }
        ((aaly) objA).c();
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            lvq.c(null);
        } else if (adw.a(this.c)) {
            lvq.a(this.e, new Callable() { // from class: aals
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aalt aaltVar = this.a;
                    synchronized (aaltVar) {
                        ((aaly) aaltVar.a.a()).d(System.currentTimeMillis(), ((aaro) aaltVar.b.a()).a());
                    }
                    return null;
                }
            });
        } else {
            lvq.c(null);
        }
    }
}
