package org.jetbrains.haskell.debugger.protocol

import java.util.Deque
import org.jetbrains.haskell.debugger.HaskellDebugProcess
import org.jetbrains.haskell.debugger.parser.Parser
import org.jetbrains.haskell.debugger.frames.HaskellStackFrameInfo
import org.jetbrains.haskell.debugger.frames.HaskellSuspendContext
import java.util.ArrayList
import org.jetbrains.haskell.debugger.frames.ProgramThreadInfo

/**
 * @author Habibullin Marat
 */
public abstract class NextPositionCommand : AbstractCommand() {
    protected fun getCurrentFrame(output: Deque<String?>): HaskellStackFrameInfo? {
        return Parser.tryParseStoppedAt(output)
    }
}