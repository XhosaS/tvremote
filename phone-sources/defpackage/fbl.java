package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbl extends HandlerThread implements Handler.Callback {
    public ecs a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public fbm e;

    public fbl() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            int i2 = message.arg1;
                            this.a.getClass();
                            ecs ecsVar = this.a;
                            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                            clw.S(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                            int[] iArr = new int[2];
                            clw.S(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                            ecsVar.d = eGLDisplayEglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean zEglChooseConfig = EGL14.eglChooseConfig(ecsVar.d, ecs.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            clw.S(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, edt.R("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(ecsVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                            clw.S(eGLContextEglCreateContext != null, "eglCreateContext failed");
                            ecsVar.e = eGLContextEglCreateContext;
                            EGLDisplay eGLDisplay = ecsVar.d;
                            EGLContext eGLContext = ecsVar.e;
                            if (i2 == 1) {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                clw.S(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                            }
                            clw.S(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
                            ecsVar.f = eGLSurfaceEglCreatePbufferSurface;
                            int[] iArr3 = ecsVar.c;
                            GLES20.glGenTextures(1, iArr3, 0);
                            clw.R();
                            ecsVar.g = new SurfaceTexture(iArr3[0]);
                            ecsVar.g.setOnFrameAvailableListener(ecsVar);
                            SurfaceTexture surfaceTexture = this.a.g;
                            surfaceTexture.getClass();
                            this.e = new fbm(this, surfaceTexture, i2 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e) {
                            edb.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                            this.c = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (ect e2) {
                        edb.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.d = new IllegalStateException(e2);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (RuntimeException e3) {
                    edb.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    this.a.getClass();
                    ecs ecsVar2 = this.a;
                    ecsVar2.b.removeCallbacks(ecsVar2);
                    try {
                        SurfaceTexture surfaceTexture2 = ecsVar2.g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.release();
                            GLES20.glDeleteTextures(1, ecsVar2.c, 0);
                        }
                        EGLDisplay eGLDisplay2 = ecsVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(ecsVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface = ecsVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(ecsVar2.d, ecsVar2.f);
                        }
                        EGLContext eGLContext2 = ecsVar2.e;
                        if (eGLContext2 != null) {
                            EGL14.eglDestroyContext(ecsVar2.d, eGLContext2);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay3 = ecsVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(ecsVar2.d);
                        }
                        ecsVar2.d = null;
                        ecsVar2.e = null;
                        ecsVar2.f = null;
                        ecsVar2.g = null;
                    } catch (Throwable th) {
                        EGLDisplay eGLDisplay4 = ecsVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(ecsVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = ecsVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(ecsVar2.d, ecsVar2.f);
                        }
                        EGLContext eGLContext3 = ecsVar2.e;
                        if (eGLContext3 != null) {
                            EGL14.eglDestroyContext(ecsVar2.d, eGLContext3);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay5 = ecsVar2.d;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(ecsVar2.d);
                        }
                        ecsVar2.d = null;
                        ecsVar2.e = null;
                        ecsVar2.f = null;
                        ecsVar2.g = null;
                        throw th;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
