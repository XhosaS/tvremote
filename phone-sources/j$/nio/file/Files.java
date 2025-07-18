package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.InterfaceC0047g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;

/* loaded from: classes4.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.C(new Object[]{y.CREATE_NEW, y.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        inputStream.getClass();
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption != null) {
                    throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
                }
                throw new NullPointerException("options contains 'null'");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().i().g(path);
                e = null;
            } catch (SecurityException e) {
                e = e;
            }
        } else {
            e = null;
        }
        try {
            OutputStream outputStreamW = path.getFileSystem().i().w(path, y.CREATE_NEW, y.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamW);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamW);
                }
                if (outputStreamW != null) {
                    outputStreamW.close();
                }
            } catch (Throwable th) {
                if (outputStreamW != null) {
                    try {
                        outputStreamW.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                c(path).a(path, new EnumC0064b[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.spi.c c(Path path) {
        return path.getFileSystem().i();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        j$.nio.file.spi.c cVarC = c(path);
        if (c(path2).equals(cVarC)) {
            cVarC.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().i().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            path2.getFileSystem().i().c(path2, new j$.nio.file.attribute.r[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().i().v(path, new InterfaceC0076n[0]);
            try {
                a(inputStreamV, path2, new CopyOption[0]);
                inputStreamV.close();
            } catch (Throwable th) {
                if (inputStreamV != null) {
                    try {
                        inputStreamV.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((InterfaceC0047g) path2.getFileSystem().i().h(path2, InterfaceC0047g.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().i().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().i().f(path);
        return path2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r3 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r2 = java.util.Arrays.copyOf(r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] readAllBytes(j$.nio.file.Path r8) throws java.io.IOException {
        /*
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            r1 = 0
            j$.nio.file.attribute.r[] r2 = new j$.nio.file.attribute.r[r1]
            j$.nio.file.spi.c r3 = c(r8)
            java.nio.channels.SeekableByteChannel r8 = r3.q(r8, r0, r2)
            java.io.InputStream r0 = java.nio.channels.Channels.newInputStream(r8)     // Catch: java.lang.Throwable -> L68
            long r2 = r8.size()     // Catch: java.lang.Throwable -> L70
            r4 = 2147483639(0x7ffffff7, double:1.060997891E-314)
            java.lang.String r6 = "Required array size too large"
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L6a
            int r3 = (int) r2
            byte[] r2 = new byte[r3]     // Catch: java.lang.Throwable -> L70
        L21:
            int r4 = r3 - r1
            int r4 = r0.read(r2, r1, r4)     // Catch: java.lang.Throwable -> L70
            if (r4 <= 0) goto L2b
            int r1 = r1 + r4
            goto L21
        L2b:
            if (r4 < 0) goto L5a
            int r4 = r0.read()     // Catch: java.lang.Throwable -> L70
            if (r4 >= 0) goto L34
            goto L5a
        L34:
            r5 = 2147483639(0x7ffffff7, float:NaN)
            int r7 = r5 - r3
            if (r3 > r7) goto L44
            int r3 = r3 << 1
            r5 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L70
            goto L49
        L44:
            if (r3 == r5) goto L54
            r3 = 2147483639(0x7ffffff7, float:NaN)
        L49:
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> L70
            int r5 = r1 + 1
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L70
            r2[r1] = r4     // Catch: java.lang.Throwable -> L70
            r1 = r5
            goto L21
        L54:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L70
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.Throwable -> L70
        L5a:
            if (r3 != r1) goto L5d
            goto L61
        L5d:
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.lang.Throwable -> L70
        L61:
            r0.close()     // Catch: java.lang.Throwable -> L68
            r8.close()
            return r2
        L68:
            r0 = move-exception
            goto L7c
        L6a:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L70
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.Throwable -> L70
        L70:
            r1 = move-exception
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L68
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L68
        L7c:
            if (r8 == 0) goto L86
            r8.close()     // Catch: java.lang.Throwable -> L82
            goto L86
        L82:
            r8 = move-exception
            r0.addSuppressed(r8)
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.Files.readAllBytes(j$.nio.file.Path):byte[]");
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) c(path).x(path, cls, linkOptionArr);
    }

    public static Path readSymbolicLink(Path path) {
        return c(path).z(path);
    }
}
