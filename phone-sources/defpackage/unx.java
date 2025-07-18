package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unx {
    public Object a;
    public final Object b;

    public unx(Object obj) {
        this.b = obj;
    }

    private final File l() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b;
                    this.a = new File(((uiz) obj).a().getFilesDir(), "PersistedInstallation." + ((uiz) obj).g() + ".json");
                }
            }
        }
        return (File) this.a;
    }

    public final unz a() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        uny unyVarA = unz.a();
        unyVarA.a = strOptString;
        unyVarA.c(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        unyVarA.b = strOptString2;
        unyVarA.c = strOptString3;
        unyVarA.d(jOptLong);
        unyVarA.b(jOptLong2);
        unyVarA.d = strOptString4;
        return unyVarA.a();
    }

    public final void b(unz unzVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", unzVar.a);
            int i = unzVar.g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", unzVar.b);
            jSONObject.put("RefreshToken", unzVar.c);
            jSONObject.put("TokenCreationEpochInSecs", unzVar.e);
            jSONObject.put("ExpiresInSecs", unzVar.d);
            jSONObject.put("FisError", unzVar.f);
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", ((uiz) this.b).a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(l())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final umd c() {
        ?? r1 = this.a;
        return new umd((String) this.b, r1 == 0 ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap((Map) r1)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void d(Annotation annotation) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(uml.class, annotation);
    }

    public final uhp e(ufv ufvVar, Executor executor) {
        executor.getClass();
        final ugs ugsVar = new ugs(executor, this);
        ugq ugqVar = new ugq(ugsVar, ufvVar, 0);
        final uic uicVar = new uic();
        final uhp uhpVar = (uhp) ((AtomicReference) this.b).getAndSet(uicVar);
        final uik uikVar = new uik(ugqVar);
        uhpVar.c(uikVar, ugsVar);
        final uhp uhpVarD = sfy.D(uikVar);
        Runnable runnable = new Runnable() { // from class: ugp
            @Override // java.lang.Runnable
            public final void run() {
                uik uikVar2 = uikVar;
                if (uikVar2.isDone()) {
                    uicVar.ev(uhpVar);
                } else if (uhpVarD.isCancelled() && ugsVar.compareAndSet(ugr.NOT_RUN, ugr.CANCELLED)) {
                    uikVar2.cancel(false);
                }
            }
        };
        ugk ugkVar = ugk.a;
        uhpVarD.c(runnable, ugkVar);
        uikVar.c(runnable, ugkVar);
        return uhpVarD;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    public final synchronized Set f() {
        if (this.a == null) {
            this.a = ((lii) this.b).a;
        }
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final ryp[] g(String str) {
        AtomicReference atomicReference = (AtomicReference) this.b.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (ryp[]) atomicReference.get();
    }

    public final synchronized void h(rwv rwvVar) {
        if (this.a == null) {
            this.a = osx.d(rwvVar.c, new rtr(this, 12), rwvVar.b());
        }
    }

    public final void i(quc qucVar) {
        ((CopyOnWriteArrayList) this.b).add(qucVar);
    }

    public final void j(quc qucVar) {
        ((CopyOnWriteArrayList) this.b).remove(qucVar);
    }

    public final void k(qua quaVar) {
        if (a.au(quaVar, this.a)) {
            return;
        }
        this.a = quaVar;
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((quc) it.next()).a();
        }
    }

    public unx(String str) {
        this.a = null;
        this.b = str;
    }

    public unx(uiz uizVar) {
        this.b = uizVar;
    }

    public unx(byte[] bArr) {
        this.a = null;
        this.b = new ConcurrentHashMap();
    }

    public unx(byte[] bArr, byte[] bArr2) {
        this.b = new CopyOnWriteArrayList();
    }

    public unx() {
        this.b = new AtomicReference(uhl.a);
        this.a = new xwk();
    }

    public unx(qua quaVar) {
        this.b = new CopyOnWriteArrayList();
        this.a = quaVar;
    }
}
