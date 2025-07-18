package defpackage;

import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdo {
    public final File a;
    public final File b;
    final Runnable c;
    public final File d;
    public final vtw e;
    public vtw f;
    public vtw g;
    private final Handler h;

    public tdo(File file, Handler handler) {
        vtw vtwVarM = wha.a.m();
        this.e = vtwVarM;
        this.f = null;
        this.g = wgz.a.m();
        this.a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "play_metalog.log");
        this.b = file2;
        this.d = new File(file, "logs_upload_attempt.log");
        vtp vtpVarA = vtp.a();
        if (vtpVarA == null) {
            tho.b("Null proto extension found. Consider using getEmptyRegistry instead", new Object[0]);
        }
        try {
            vtwVarM.g(h(file2), vtpVarA);
        } catch (IOException unused) {
            tho.a("Failed to restore PlayMetalog", new Object[0]);
            vtw vtwVar = this.e;
            if (vtwVar.a.A()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            vtwVar.b = vtwVar.q();
        }
        try {
            this.g.g(h(this.d), vtpVarA);
        } catch (IOException unused2) {
            tho.a("Failed to restore LogsUploadAttempt", new Object[0]);
            vtw vtwVar2 = this.g;
            if (vtwVar2.a.A()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            vtwVar2.b = vtwVar2.q();
        }
        this.c = new tci(this, 4, null);
        this.h = handler;
    }

    public static final void d(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
        } finally {
            fileOutputStream.close();
        }
    }

    private static final byte[] h(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i = 0;
            while (i < length) {
                int i2 = fileInputStream.read(bArr, i, length - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }

    public final void a(boolean z) {
        if (z) {
            vtw vtwVar = this.e;
            vuc vucVar = vtwVar.b;
            int i = ((wha) vucVar).k + 1;
            if (!vucVar.A()) {
                vtwVar.u();
            }
            wha whaVar = (wha) vtwVar.b;
            whaVar.b |= 64;
            whaVar.k = i;
        } else {
            vtw vtwVar2 = this.e;
            vuc vucVar2 = vtwVar2.b;
            int i2 = ((wha) vucVar2).j + 1;
            if (!vucVar2.A()) {
                vtwVar2.u();
            }
            wha whaVar2 = (wha) vtwVar2.b;
            whaVar2.b |= 32;
            whaVar2.j = i2;
        }
        b();
    }

    public final void b() {
        Handler handler = this.h;
        Runnable runnable = this.c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 2000L);
    }

    public final void c(int i) {
        vtw vtwVar = this.e;
        vuc vucVar = vtwVar.b;
        if (i > ((wha) vucVar).d) {
            if (!vucVar.A()) {
                vtwVar.u();
            }
            wha whaVar = (wha) vtwVar.b;
            whaVar.b |= 2;
            whaVar.d = i;
            b();
        }
    }

    public final void e(int i) {
        vtw vtwVar = this.e;
        if (((wha) vtwVar.b).e.size() >= 1000) {
            return;
        }
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wha whaVar = (wha) vtwVar.b;
        vuj vujVar = whaVar.e;
        if (!vujVar.c()) {
            whaVar.e = vuc.q(vujVar);
        }
        whaVar.e.g(i - 1);
        b();
    }

    public final void f(int i) {
        vtw vtwVar = this.g;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wgz wgzVar = (wgz) vtwVar.b;
        wgz wgzVar2 = wgz.a;
        vuj vujVar = wgzVar.d;
        if (!vujVar.c()) {
            wgzVar.d = vuc.q(vujVar);
        }
        wgzVar.d.g(i - 1);
        b();
    }

    public final void g(int i) {
        this.f.aD(i);
        b();
    }
}
