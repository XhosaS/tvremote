package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcr implements GLSurfaceView.Renderer, fcm {
    final /* synthetic */ fcs a;
    private final fcq b;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private float h;
    private float i;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];

    public fcr(fcs fcsVar, fcq fcqVar) {
        this.a = fcsVar;
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.b = fcqVar;
        clw.T(fArr);
        clw.T(fArr2);
        clw.T(fArr3);
        this.i = 3.1415927f;
    }

    private final void c() {
        Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), 0.0f);
    }

    @Override // defpackage.fcm
    public final synchronized void a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.e, 0, 16);
        this.i = -f;
        c();
    }

    public final synchronized void b(PointF pointF) {
        this.h = pointF.y;
        c();
        Matrix.setRotateM(this.g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            float[] fArr = this.k;
            Matrix.multiplyMM(fArr, 0, this.e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f, 0, fArr, 0);
        }
        float[] fArr2 = this.d;
        Matrix.multiplyMM(fArr2, 0, this.c, 0, this.j, 0);
        fcq fcqVar = this.b;
        GLES20.glClear(16384);
        try {
            clw.R();
        } catch (ect e) {
            edb.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (fcqVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = fcqVar.i;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                clw.R();
            } catch (ect e2) {
                edb.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (fcqVar.b.compareAndSet(true, false)) {
                clw.T(fcqVar.f);
            }
            long timestamp = fcqVar.i.getTimestamp();
            Long l = (Long) fcqVar.d.b(timestamp);
            if (l != null) {
                mma mmaVar = fcqVar.j;
                float[] fArr3 = fcqVar.f;
                float[] fArr4 = (float[]) ((edn) mmaVar.c).d(l.longValue());
                if (fArr4 != null) {
                    Object obj = mmaVar.d;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM((float[]) obj, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        clw.T((float[]) obj);
                    }
                    if (!mmaVar.a) {
                        mma.h((float[]) mmaVar.b, (float[]) obj);
                        mmaVar.a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) mmaVar.b, 0, (float[]) obj, 0);
                }
            }
            obk obkVar = (obk) fcqVar.e.d(timestamp);
            if (obkVar != null) {
                fco fcoVar = fcqVar.c;
                if (fco.a(obkVar)) {
                    fcoVar.d = obkVar.a;
                    fcoVar.j = new gze(((dhq) obkVar.d).C());
                    if (!obkVar.b) {
                        new gze(((dhq) obkVar.c).C());
                    }
                }
            }
        }
        float[] fArr5 = fcqVar.g;
        Matrix.multiplyMM(fArr5, 0, fArr2, 0, fcqVar.f, 0);
        fco fcoVar2 = fcqVar.c;
        int i = fcqVar.h;
        gze gzeVar = fcoVar2.j;
        if (gzeVar == null) {
            return;
        }
        int i2 = fcoVar2.d;
        GLES20.glUniformMatrix3fv(fcoVar2.f, 1, false, i2 == 1 ? fco.b : i2 == 2 ? fco.c : fco.a, 0);
        GLES20.glUniformMatrix4fv(fcoVar2.e, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(fcoVar2.i, 0);
        try {
            clw.R();
        } catch (ect e3) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(fcoVar2.g, 3, 5126, false, 12, (Buffer) gzeVar.d);
        try {
            clw.R();
        } catch (ect e4) {
            Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(fcoVar2.h, 2, 5126, false, 8, (Buffer) gzeVar.c);
        try {
            clw.R();
        } catch (ect e5) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(gzeVar.a, 0, gzeVar.b);
        try {
            clw.R();
        } catch (ect e6) {
            Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            double degrees = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final fcq fcqVar = this.b;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            clw.R();
            fco fcoVar = fcqVar.c;
            try {
                fcoVar.k = new sro("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
                fcoVar.e = fcoVar.k.f("uMvpMatrix");
                fcoVar.f = fcoVar.k.f("uTexMatrix");
                fcoVar.g = fcoVar.k.d("aPosition");
                fcoVar.h = fcoVar.k.d("aTexCoords");
                fcoVar.i = fcoVar.k.f("uTexture");
            } catch (ect e) {
                Log.e("ProjectionRenderer", "Failed to initialize the program", e);
            }
            clw.R();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            clw.R();
            int i = iArr[0];
            clw.W(36197, i);
            fcqVar.h = i;
        } catch (ect e2) {
            edb.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        fcs fcsVar = this.a;
        fcqVar.i = new SurfaceTexture(fcqVar.h);
        fcqVar.i.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: fcp
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                fcqVar.a.set(true);
            }
        });
        fcsVar.b.post(new eoy(fcsVar, fcqVar.i, 16));
    }
}
