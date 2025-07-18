package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbs implements GLSurfaceView.Renderer {
    private static final float[] c = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private static final float[] d = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final float[] e = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    private static final String[] f = {"y_tex", "u_tex", "v_tex"};
    private static final FloatBuffer g = clw.Q(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final GLSurfaceView a;
    private int m;
    private VideoDecoderOutputBuffer n;
    private sro o;
    private final int[] h = new int[3];
    private final int[] i = new int[3];
    private final int[] j = new int[3];
    private final int[] k = new int[3];
    public final AtomicReference b = new AtomicReference();
    private final FloatBuffer[] l = new FloatBuffer[3];

    public fbs(GLSurfaceView gLSurfaceView) {
        this.a = gLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.j;
            this.k[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.b.getAndSet(null);
        if (videoDecoderOutputBuffer == null && this.n == null) {
            return;
        }
        if (videoDecoderOutputBuffer != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.n;
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            this.n = videoDecoderOutputBuffer;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = this.n;
        videoDecoderOutputBuffer3.getClass();
        float[] fArr = d;
        int i = videoDecoderOutputBuffer3.colorspace;
        if (i == 1) {
            fArr = c;
        } else if (i == 3) {
            fArr = e;
        }
        GLES20.glUniformMatrix3fv(this.m, 1, false, fArr, 0);
        int[] iArr = videoDecoderOutputBuffer3.yuvStrides;
        iArr.getClass();
        ByteBuffer[] byteBufferArr = videoDecoderOutputBuffer3.yuvPlanes;
        byteBufferArr.getClass();
        int i2 = 0;
        while (i2 < 3) {
            int i3 = i2 == 0 ? videoDecoderOutputBuffer3.height : (videoDecoderOutputBuffer3.height + 1) / 2;
            GLES20.glActiveTexture(33984 + i2);
            GLES20.glBindTexture(3553, this.h[i2]);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
            i2++;
        }
        int i4 = videoDecoderOutputBuffer3.width;
        int i5 = (i4 + 1) / 2;
        int[] iArr2 = {i4, i5, i5};
        for (int i6 = 0; i6 < 3; i6++) {
            int[] iArr3 = this.j;
            if (iArr3[i6] != iArr2[i6] || this.k[i6] != iArr[i6]) {
                a.ab(iArr[i6] != 0);
                float f2 = iArr2[i6];
                float f3 = iArr[i6];
                FloatBuffer[] floatBufferArr = this.l;
                float f4 = f2 / f3;
                FloatBuffer floatBufferQ = clw.Q(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f4, 0.0f, f4, 1.0f});
                floatBufferArr[i6] = floatBufferQ;
                GLES20.glVertexAttribPointer(this.i[i6], 2, 5126, false, 0, (Buffer) floatBufferQ);
                iArr3[i6] = iArr2[i6];
                this.k[i6] = iArr[i6];
            }
        }
        GLES20.glClear(16384);
        GLES20.glDrawArrays(5, 0, 4);
        try {
            clw.R();
        } catch (ect e2) {
            Log.e("VideoDecoderGLSV", "Failed to draw a frame", e2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            sro sroVar = new sro("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.o = sroVar;
            GLES20.glVertexAttribPointer(sroVar.d("in_pos"), 2, 5126, false, 0, (Buffer) g);
            int[] iArr = this.i;
            iArr[0] = this.o.d("in_tc_y");
            iArr[1] = this.o.d("in_tc_u");
            iArr[2] = this.o.d("in_tc_v");
            this.m = this.o.f("mColorConversion");
            clw.R();
            try {
                int[] iArr2 = this.h;
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.o.f(f[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    clw.W(3553, iArr2[i]);
                }
                clw.R();
            } catch (ect e2) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e2);
            }
            clw.R();
        } catch (ect e3) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e3);
        }
    }
}
