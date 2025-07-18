package defpackage;

import android.os.ConditionVariable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfb implements leu {
    public final String a;
    public final String b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final FilenameFilter d = new lzf(this, 1);
    public final ConditionVariable e = new ConditionVariable(false);
    private volatile boolean f;

    private lfb(String str, String str2) {
        str.getClass();
        a.H(new File(str).isDirectory());
        this.a = str;
        this.b = str2;
    }

    public static lfb b(String str, String str2, Executor executor) {
        lfb lfbVar = new lfb(str, str2);
        executor.getClass();
        lfbVar.f = true;
        executor.execute(new jlr(lfbVar, 18));
        return lfbVar;
    }

    public static final void e(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static final void f(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.leu
    public final void a() {
        d();
        ConcurrentHashMap concurrentHashMap = this.c;
        for (String str : concurrentHashMap.keySet()) {
            concurrentHashMap.remove(str);
            new File(this.a, str).delete();
        }
    }

    public final String c(Object obj, idf idfVar) {
        return krh.e((String) idfVar.b(obj)) + this.b + ".cache";
    }

    public final void d() {
        a.ah(this.f, "init() must be called before calling to this method");
        this.e.block();
    }
}
