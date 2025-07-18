package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.InterfaceC0009g;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.nio.file.attribute.InterfaceC0020s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;

/* loaded from: classes3.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.desugar.sun.nio.fs.g.D(new Object[]{z.CREATE_NEW, z.WRITE});
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
            OutputStream outputStreamW = path.getFileSystem().i().w(path, z.CREATE_NEW, z.WRITE);
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

    public static boolean b(Path path, EnumC0038l... enumC0038lArr) {
        if (enumC0038lArr.length == 0) {
            c(path);
        }
        try {
            int length = enumC0038lArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                EnumC0038l enumC0038l = enumC0038lArr[i];
                if (enumC0038l != EnumC0038l.NOFOLLOW_LINKS) {
                    enumC0038l.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                c(path).a(path, new EnumC0028b[0]);
                return true;
            }
            c(path).x(path, InterfaceC0012j.class, EnumC0038l.NOFOLLOW_LINKS);
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
        copyOptionArr2[length] = EnumC0038l.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == EnumC0038l.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + String.valueOf(copyOption2) + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        InterfaceC0012j interfaceC0012jX = c(path).x(path, InterfaceC0012j.class, z ? new EnumC0038l[0] : new EnumC0038l[]{EnumC0038l.NOFOLLOW_LINKS});
        if (interfaceC0012jX.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().i().g(path2);
        } else if (b(path2, new EnumC0038l[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (interfaceC0012jX.isDirectory()) {
            path2.getFileSystem().i().c(path2, new InterfaceC0020s[0]);
        } else {
            InputStream inputStreamV = path.getFileSystem().i().v(path, new InterfaceC0041o[0]);
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
                ((InterfaceC0009g) path2.getFileSystem().i().h(path2, InterfaceC0009g.class, new EnumC0038l[0])).a(interfaceC0012jX.lastModifiedTime(), interfaceC0012jX.lastAccessTime(), interfaceC0012jX.creationTime());
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
}
